package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prpi006 extends GXProcedure
{
   public prpi006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prpi006.class ), "" );
   }

   public prpi006( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          byte[] aP6 ,
                          String[] aP7 ,
                          short[] aP8 ,
                          short[] aP9 ,
                          String[] aP10 ,
                          byte[] aP11 ,
                          String[] aP12 )
   {
      prpi006.this.aP13 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 ,
                        int[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 ,
                             int[] aP13 )
   {
      prpi006.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prpi006.this.AV15BarCodOri = aP1[0];
      this.aP1 = aP1;
      prpi006.this.AV16BarReoOri = aP2[0];
      this.aP2 = aP2;
      prpi006.this.AV17BarParOri = aP3[0];
      this.aP3 = aP3;
      prpi006.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      prpi006.this.AV19BarParPan = aP5[0];
      this.aP5 = aP5;
      prpi006.this.AV20BarSit = aP6[0];
      this.aP6 = aP6;
      prpi006.this.AV21Reo = aP7[0];
      this.aP7 = aP7;
      prpi006.this.AV22TipDefCod = aP8[0];
      this.aP8 = aP8;
      prpi006.this.AV23TipDefPor = aP9[0];
      this.aP9 = aP9;
      prpi006.this.AV24BarMaqCod = aP10[0];
      this.aP10 = aP10;
      prpi006.this.AV25BarConReo = aP11[0];
      this.aP11 = aP11;
      prpi006.this.AV26Codigo = aP12[0];
      this.aP12 = aP12;
      prpi006.this.AV27DisCod = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV134FlagHil = (byte)(0) ;
      GXv_int1[0] = AV134FlagHil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HILO", ""), GXv_int1) ;
      prpi006.this.AV134FlagHil = GXv_int1[0] ;
      AV136FlagBros = (byte)(0) ;
      GXv_int1[0] = AV136FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int1) ;
      prpi006.this.AV136FlagBros = GXv_int1[0] ;
      AV141Pervaf = (byte)(0) ;
      GXv_int1[0] = AV141Pervaf ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int1) ;
      prpi006.this.AV141Pervaf = GXv_int1[0] ;
      GXt_char2 = AV150ContDsc ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "CLISKP", "") ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
      prpi006.this.A396EmprCod = GXv_char3[0] ;
      prpi006.this.GXt_char2 = GXv_char5[0] ;
      AV150ContDsc = GXt_char2 ;
      AV148CliPropio = (int)(GXutil.lval( GXutil.trim( AV150ContDsc))) ;
      GXv_int1[0] = AV161Artextil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int1) ;
      prpi006.this.AV161Artextil = GXv_int1[0] ;
      GXt_int6 = AV167Jpf ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int1) ;
      prpi006.this.GXt_int6 = GXv_int1[0] ;
      AV167Jpf = GXt_int6 ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = AV140JBMartin ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int1) ;
      prpi006.this.AV140JBMartin = GXv_int1[0] ;
      AV162Lindalana = (byte)(0) ;
      GXv_int1[0] = AV162Lindalana ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int1) ;
      prpi006.this.AV162Lindalana = GXv_int1[0] ;
      AV140JBMartin = (byte)(0) ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV159Intexco)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int1) ;
      prpi006.this.AV159Intexco = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      GXt_int6 = AV160Texfina ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int1) ;
      prpi006.this.GXt_int6 = GXv_int1[0] ;
      AV160Texfina = GXt_int6 ;
      GXt_int6 = AV166Vertex ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VERTEX", ""), GXv_int1) ;
      prpi006.this.GXt_int6 = GXv_int1[0] ;
      AV166Vertex = GXt_int6 ;
      GXt_int6 = AV187Torient ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int1) ;
      prpi006.this.GXt_int6 = GXv_int1[0] ;
      AV187Torient = GXt_int6 ;
      GXt_int6 = AV188PzasLector ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PZLCXX", ""), GXv_int1) ;
      prpi006.this.GXt_int6 = GXv_int1[0] ;
      AV188PzasLector = GXt_int6 ;
      GXt_int7 = AV189ConVal ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "PZLCXX", "") ;
      GXv_int8[0] = GXt_int7 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int8) ;
      prpi006.this.A396EmprCod = GXv_char5[0] ;
      prpi006.this.GXt_int7 = GXv_int8[0] ;
      AV189ConVal = GXt_int7 ;
      GXt_char2 = AV173Station ;
      GXv_char5[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      prpi006.this.GXt_char2 = GXv_char5[0] ;
      AV173Station = GXt_char2 ;
      GXv_char5[0] = A396EmprCod ;
      GXv_char4[0] = AV174EmprNom ;
      GXv_char3[0] = AV172Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV173Station, GXv_char5, GXv_char4, GXv_char3) ;
      prpi006.this.A396EmprCod = GXv_char5[0] ;
      prpi006.this.AV174EmprNom = GXv_char4[0] ;
      prpi006.this.AV172Usurcod = GXv_char3[0] ;
      AV35EmprCod = A396EmprCod ;
      AV190Inc_obs = "" ;
      AV191Col_Inc_obs.clear();
      /* Using cursor P04R62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), AV17BarParOri, Byte.valueOf(AV140JBMartin), AV159Intexco, Byte.valueOf(AV162Lindalana), Byte.valueOf(AV140JBMartin), AV159Intexco, Byte.valueOf(AV162Lindalana)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04R62_A130BarCodPar[0] ;
         A132BarCodReo = P04R62_A132BarCodReo[0] ;
         A129BarCod = P04R62_A129BarCod[0] ;
         A138BarConReo = P04R62_A138BarConReo[0] ;
         AV192Item_Col_Inc_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Modificacion BARCAD. Contador Reoperados", "")+GXutil.newLine( ) );
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Hd Origen       = ", "")+GXutil.str( AV18BarCod, 8, 0)+"-"+"0"+AV17BarParOri+GXutil.newLine( ) );
         AV192Item_Col_Inc_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV192Item_Col_Inc_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( "Contador        =", "")+GXutil.str( A138BarConReo, 1, 0)+" <- "+GXutil.str( AV25BarConReo, 1, 0) );
         AV191Col_Inc_obs.add(AV192Item_Col_Inc_obs, 0);
         A138BarConReo = AV25BarConReo ;
         /* Using cursor P04R63 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A138BarConReo), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV191Col_Inc_obs.size() > 0 )
      {
         AV193Json_inc_obs = AV191Col_Inc_obs.toJSonString(false) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV197Pgmname, AV172Usurcod, AV173Station, AV193Json_inc_obs, AV18BarCod, AV16BarReoOri, AV17BarParOri) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prpi006.this.A396EmprCod;
      this.aP1[0] = prpi006.this.AV15BarCodOri;
      this.aP2[0] = prpi006.this.AV16BarReoOri;
      this.aP3[0] = prpi006.this.AV17BarParOri;
      this.aP4[0] = prpi006.this.AV18BarCod;
      this.aP5[0] = prpi006.this.AV19BarParPan;
      this.aP6[0] = prpi006.this.AV20BarSit;
      this.aP7[0] = prpi006.this.AV21Reo;
      this.aP8[0] = prpi006.this.AV22TipDefCod;
      this.aP9[0] = prpi006.this.AV23TipDefPor;
      this.aP10[0] = prpi006.this.AV24BarMaqCod;
      this.aP11[0] = prpi006.this.AV25BarConReo;
      this.aP12[0] = prpi006.this.AV26Codigo;
      this.aP13[0] = prpi006.this.AV27DisCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV150ContDsc = "" ;
      AV159Intexco = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      GXv_int8 = new int[1] ;
      AV173Station = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV174EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV172Usurcod = "" ;
      GXv_char3 = new String[1] ;
      AV35EmprCod = "" ;
      AV190Inc_obs = "" ;
      AV191Col_Inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P04R62_A396EmprCod = new String[] {""} ;
      P04R62_A130BarCodPar = new String[] {""} ;
      P04R62_A132BarCodReo = new byte[1] ;
      P04R62_A129BarCod = new int[1] ;
      P04R62_A138BarConReo = new byte[1] ;
      A130BarCodPar = "" ;
      AV192Item_Col_Inc_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV193Json_inc_obs = "" ;
      AV197Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prpi006__default(),
         new Object[] {
             new Object[] {
            P04R62_A396EmprCod, P04R62_A130BarCodPar, P04R62_A132BarCodReo, P04R62_A129BarCod, P04R62_A138BarConReo
            }
            , new Object[] {
            }
         }
      );
      AV197Pgmname = "PRPI006" ;
      /* GeneXus formulas. */
      AV197Pgmname = "PRPI006" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16BarReoOri ;
   private byte AV20BarSit ;
   private byte AV25BarConReo ;
   private byte AV134FlagHil ;
   private byte AV136FlagBros ;
   private byte AV141Pervaf ;
   private byte AV161Artextil ;
   private byte AV167Jpf ;
   private byte AV140JBMartin ;
   private byte AV162Lindalana ;
   private byte AV160Texfina ;
   private byte AV166Vertex ;
   private byte AV187Torient ;
   private byte AV188PzasLector ;
   private byte GXt_int6 ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A138BarConReo ;
   private short AV22TipDefCod ;
   private short AV23TipDefPor ;
   private short Gx_err ;
   private int AV15BarCodOri ;
   private int AV18BarCod ;
   private int AV27DisCod ;
   private int AV148CliPropio ;
   private int AV189ConVal ;
   private int GXt_int7 ;
   private int GXv_int8[] ;
   private int A129BarCod ;
   private java.math.BigDecimal AV159Intexco ;
   private String A396EmprCod ;
   private String AV17BarParOri ;
   private String AV19BarParPan ;
   private String AV21Reo ;
   private String AV24BarMaqCod ;
   private String AV26Codigo ;
   private String AV150ContDsc ;
   private String AV173Station ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String AV174EmprNom ;
   private String GXv_char4[] ;
   private String AV172Usurcod ;
   private String GXv_char3[] ;
   private String AV35EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV197Pgmname ;
   private String AV193Json_inc_obs ;
   private String AV190Inc_obs ;
   private int[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P04R62_A396EmprCod ;
   private String[] P04R62_A130BarCodPar ;
   private byte[] P04R62_A132BarCodReo ;
   private int[] P04R62_A129BarCod ;
   private byte[] P04R62_A138BarConReo ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV191Col_Inc_obs ;
   private app.SdtIncidenciasObservaciones_SDT AV192Item_Col_Inc_obs ;
}

final  class prpi006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04R62", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarConReo FROM TXPBARCAD WHERE (EmprCod = ? and BarCod = ?) AND (BarCodReo = 0) AND (( BarCodPar = ? and ? = 0 and ? = 0 and ? = 0) or ( BarCodPar = ' ' and ( ? = 1 or ? = 1 or ? = 1))) ORDER BY EmprCod, BarCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R63", "UPDATE TXPBARCAD SET BarConReo=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

