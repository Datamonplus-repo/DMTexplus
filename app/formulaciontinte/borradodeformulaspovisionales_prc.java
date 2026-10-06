package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class borradodeformulaspovisionales_prc extends GXProcedure
{
   public borradodeformulaspovisionales_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( borradodeformulaspovisionales_prc.class ), "" );
   }

   public borradodeformulaspovisionales_prc( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        int aP7 ,
                        int aP8 ,
                        byte aP9 ,
                        byte aP10 ,
                        String aP11 ,
                        String aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             int aP7 ,
                             int aP8 ,
                             byte aP9 ,
                             byte aP10 ,
                             String aP11 ,
                             String aP12 )
   {
      borradodeformulaspovisionales_prc.this.AV8Emprcod = aP0;
      borradodeformulaspovisionales_prc.this.AV9Clicod = aP1;
      borradodeformulaspovisionales_prc.this.AV15CliCod_to = aP2;
      borradodeformulaspovisionales_prc.this.AV10Forser = aP3;
      borradodeformulaspovisionales_prc.this.AV16Forser_to = aP4;
      borradodeformulaspovisionales_prc.this.AV11Forcolnom = aP5;
      borradodeformulaspovisionales_prc.this.AV17Forcolnom_to = aP6;
      borradodeformulaspovisionales_prc.this.AV12Forcolnum = aP7;
      borradodeformulaspovisionales_prc.this.AV18Forcolnum_to = aP8;
      borradodeformulaspovisionales_prc.this.AV13TipColCod = aP9;
      borradodeformulaspovisionales_prc.this.AV19Tipcolcod_to = aP10;
      borradodeformulaspovisionales_prc.this.AV21Usurcod = aP11;
      borradodeformulaspovisionales_prc.this.AV22Station = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23formulas = (short)(0) ;
      AV24formulasnoeliminadas = (short)(0) ;
      AV25Col_Inc_Obs.clear();
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV9Clicod) ,
                                           Integer.valueOf(AV15CliCod_to) ,
                                           AV10Forser ,
                                           AV16Forser_to ,
                                           AV11Forcolnom ,
                                           AV17Forcolnom_to ,
                                           Integer.valueOf(AV12Forcolnum) ,
                                           Integer.valueOf(AV18Forcolnum_to) ,
                                           Byte.valueOf(AV13TipColCod) ,
                                           Byte.valueOf(AV19Tipcolcod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A2749ForPro ,
                                           AV8Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09D12 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV9Clicod), Integer.valueOf(AV15CliCod_to), AV10Forser, AV16Forser_to, AV11Forcolnom, AV17Forcolnom_to, Integer.valueOf(AV12Forcolnum), Integer.valueOf(AV18Forcolnum_to), Byte.valueOf(AV13TipColCod), Byte.valueOf(AV19Tipcolcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2749ForPro = P09D12_A2749ForPro[0] ;
         n2749ForPro = P09D12_n2749ForPro[0] ;
         A831TipColCod = P09D12_A831TipColCod[0] ;
         A483ForColNum = P09D12_A483ForColNum[0] ;
         A482ForColNom = P09D12_A482ForColNom[0] ;
         A494ForSer = P09D12_A494ForSer[0] ;
         A252CliCod = P09D12_A252CliCod[0] ;
         A396EmprCod = P09D12_A396EmprCod[0] ;
         A486ForNumCol = P09D12_A486ForNumCol[0] ;
         A496ForUltUti = P09D12_A496ForUltUti[0] ;
         n496ForUltUti = P09D12_n496ForUltUti[0] ;
         GXt_int1 = AV28Num_Hdrs ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A494ForSer ;
         GXv_char5[0] = A482ForColNom ;
         GXv_int6[0] = A483ForColNum ;
         GXv_int7[0] = A831TipColCod ;
         GXv_int8[0] = GXt_int1 ;
         new app.formulaciontinte.pkilequi2(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_int8) ;
         borradodeformulaspovisionales_prc.this.A396EmprCod = GXv_char2[0] ;
         borradodeformulaspovisionales_prc.this.A252CliCod = GXv_int3[0] ;
         borradodeformulaspovisionales_prc.this.A494ForSer = GXv_char4[0] ;
         borradodeformulaspovisionales_prc.this.A482ForColNom = GXv_char5[0] ;
         borradodeformulaspovisionales_prc.this.A483ForColNum = GXv_int6[0] ;
         borradodeformulaspovisionales_prc.this.A831TipColCod = GXv_int7[0] ;
         borradodeformulaspovisionales_prc.this.GXt_int1 = GXv_int8[0] ;
         AV28Num_Hdrs = (short)(GXt_int1) ;
         GXt_int1 = AV29Num_HdrsH ;
         GXv_int8[0] = GXt_int1 ;
         new app.formulaciontinte.pkilequi2historico(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int8) ;
         borradodeformulaspovisionales_prc.this.GXt_int1 = GXv_int8[0] ;
         AV29Num_HdrsH = (short)(GXt_int1) ;
         if ( ( AV28Num_Hdrs == 0 ) && ( AV29Num_HdrsH == 0 ) )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int8[0] = A252CliCod ;
            GXv_char4[0] = A494ForSer ;
            GXv_char2[0] = A482ForColNom ;
            GXv_int6[0] = A483ForColNum ;
            GXv_int7[0] = A831TipColCod ;
            GXv_int3[0] = A486ForNumCol ;
            new app.pelifor(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_char4, GXv_char2, GXv_int6, GXv_int7, GXv_int3) ;
            borradodeformulaspovisionales_prc.this.A396EmprCod = GXv_char5[0] ;
            borradodeformulaspovisionales_prc.this.A252CliCod = GXv_int8[0] ;
            borradodeformulaspovisionales_prc.this.A494ForSer = GXv_char4[0] ;
            borradodeformulaspovisionales_prc.this.A482ForColNom = GXv_char2[0] ;
            borradodeformulaspovisionales_prc.this.A483ForColNum = GXv_int6[0] ;
            borradodeformulaspovisionales_prc.this.A831TipColCod = GXv_int7[0] ;
            borradodeformulaspovisionales_prc.this.A486ForNumCol = GXv_int3[0] ;
            AV26Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "DLT, Formula Teñido Provisional.", "") );
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Cliente = ", "")+GXutil.str( A252CliCod, 6, 0) );
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Artículo= ", "")+GXutil.trim( A494ForSer) );
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Color   = ", "")+GXutil.trim( A482ForColNom) );
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Numero  = ", "")+GXutil.trim( GXutil.str( A483ForColNum, 6, 0)) );
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Tc      = ", "")+GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Nº formula = ", "")+GXutil.trim( GXutil.str( A486ForNumCol, 8, 0)) );
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Fec Ult Ut = ", "")+GXutil.trim( localUtil.dtoc( A496ForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) );
            AV26Item_Col_Inc_Obs.setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( A486ForNumCol );
            AV25Col_Inc_Obs.add(AV26Item_Col_Inc_Obs, 0);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV25Col_Inc_Obs.size() > 0 )
      {
         AV33GXV1 = 1 ;
         while ( AV33GXV1 <= AV25Col_Inc_Obs.size() )
         {
            AV26Item_Col_Inc_Obs = (app.SdtIncidenciasObservaciones_SDT)((app.SdtIncidenciasObservaciones_SDT)AV25Col_Inc_Obs.elementAt(-1+AV33GXV1));
            AV20Inc_Obs = AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs() ;
            AV27fornumcol = AV26Item_Col_Inc_Obs.getgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol() ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV21Usurcod, AV22Station, AV20Inc_Obs, AV27fornumcol, (byte)(9), httpContext.getMessage( "z", "")) ;
            AV33GXV1 = (int)(AV33GXV1+1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Col_Inc_Obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A2749ForPro = "" ;
      A396EmprCod = "" ;
      P09D12_A2749ForPro = new String[] {""} ;
      P09D12_n2749ForPro = new boolean[] {false} ;
      P09D12_A831TipColCod = new byte[1] ;
      P09D12_A483ForColNum = new int[1] ;
      P09D12_A482ForColNom = new String[] {""} ;
      P09D12_A494ForSer = new String[] {""} ;
      P09D12_A252CliCod = new int[1] ;
      P09D12_A396EmprCod = new String[] {""} ;
      P09D12_A486ForNumCol = new int[1] ;
      P09D12_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09D12_n496ForUltUti = new boolean[] {false} ;
      A496ForUltUti = GXutil.nullDate() ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int3 = new int[1] ;
      AV26Item_Col_Inc_Obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV20Inc_Obs = "" ;
      AV34Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.borradodeformulaspovisionales_prc__default(),
         new Object[] {
             new Object[] {
            P09D12_A2749ForPro, P09D12_n2749ForPro, P09D12_A831TipColCod, P09D12_A483ForColNum, P09D12_A482ForColNom, P09D12_A494ForSer, P09D12_A252CliCod, P09D12_A396EmprCod, P09D12_A486ForNumCol, P09D12_A496ForUltUti,
            P09D12_n496ForUltUti
            }
         }
      );
      AV34Pgmname = "FormulacionTinte.BorradodeFormulasPovisionales_PRC" ;
      /* GeneXus formulas. */
      AV34Pgmname = "FormulacionTinte.BorradodeFormulasPovisionales_PRC" ;
      Gx_err = (short)(0) ;
   }

   private byte AV13TipColCod ;
   private byte AV19Tipcolcod_to ;
   private byte A831TipColCod ;
   private byte GXv_int7[] ;
   private short AV23formulas ;
   private short AV24formulasnoeliminadas ;
   private short AV28Num_Hdrs ;
   private short AV29Num_HdrsH ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int AV15CliCod_to ;
   private int AV12Forcolnum ;
   private int AV18Forcolnum_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int GXt_int1 ;
   private int GXv_int8[] ;
   private int GXv_int6[] ;
   private int GXv_int3[] ;
   private int AV33GXV1 ;
   private int AV27fornumcol ;
   private String AV8Emprcod ;
   private String AV10Forser ;
   private String AV16Forser_to ;
   private String AV11Forcolnom ;
   private String AV17Forcolnom_to ;
   private String AV21Usurcod ;
   private String AV22Station ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A2749ForPro ;
   private String A396EmprCod ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String AV34Pgmname ;
   private java.util.Date A496ForUltUti ;
   private boolean n2749ForPro ;
   private boolean n496ForUltUti ;
   private String AV20Inc_Obs ;
   private IDataStoreProvider pr_default ;
   private String[] P09D12_A2749ForPro ;
   private boolean[] P09D12_n2749ForPro ;
   private byte[] P09D12_A831TipColCod ;
   private int[] P09D12_A483ForColNum ;
   private String[] P09D12_A482ForColNom ;
   private String[] P09D12_A494ForSer ;
   private int[] P09D12_A252CliCod ;
   private String[] P09D12_A396EmprCod ;
   private int[] P09D12_A486ForNumCol ;
   private java.util.Date[] P09D12_A496ForUltUti ;
   private boolean[] P09D12_n496ForUltUti ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV25Col_Inc_Obs ;
   private app.SdtIncidenciasObservaciones_SDT AV26Item_Col_Inc_Obs ;
}

final  class borradodeformulaspovisionales_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09D12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV9Clicod ,
                                          int AV15CliCod_to ,
                                          String AV10Forser ,
                                          String AV16Forser_to ,
                                          String AV11Forcolnom ,
                                          String AV17Forcolnom_to ,
                                          int AV12Forcolnum ,
                                          int AV18Forcolnum_to ,
                                          byte AV13TipColCod ,
                                          byte AV19Tipcolcod_to ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A2749ForPro ,
                                          String AV8Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[11];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT ForPro, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCol, ForUltUti FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ForPro = 'S')");
      if ( ! (0==AV9Clicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (0==AV15CliCod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10Forser)==0) )
      {
         addWhere(sWhereString, "(ForSer >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Forser_to)==0) )
      {
         addWhere(sWhereString, "(ForSer <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11Forcolnom)==0) )
      {
         addWhere(sWhereString, "(ForColNom >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(ForColNom <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV12Forcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV18Forcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV13TipColCod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV19Tipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09D12(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09D12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               return;
      }
   }

}

