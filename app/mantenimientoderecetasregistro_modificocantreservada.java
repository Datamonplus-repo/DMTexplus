package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientoderecetasregistro_modificocantreservada extends GXProcedure
{
   public mantenimientoderecetasregistro_modificocantreservada( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientoderecetasregistro_modificocantreservada.class ), "" );
   }

   public mantenimientoderecetasregistro_modificocantreservada( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      mantenimientoderecetasregistro_modificocantreservada.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      mantenimientoderecetasregistro_modificocantreservada.this.AV8Emprcod = aP0[0];
      this.aP0 = aP0;
      mantenimientoderecetasregistro_modificocantreservada.this.AV9Prdnum = aP1[0];
      this.aP1 = aP1;
      mantenimientoderecetasregistro_modificocantreservada.this.AV10Canres = aP2[0];
      this.aP2 = aP2;
      mantenimientoderecetasregistro_modificocantreservada.this.AV11Canresold = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientoderecetasregistro_modificocantreservada.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = AV8Emprcod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientoderecetasregistro_modificocantreservada.this.AV8Emprcod = GXv_char2[0] ;
      mantenimientoderecetasregistro_modificocantreservada.this.AV13EmprNom = GXv_char3[0] ;
      mantenimientoderecetasregistro_modificocantreservada.this.AV14UsurCod = GXv_char4[0] ;
      AV15Inc_obs = "" ;
      AV18GXLvl7 = (byte)(0) ;
      /* Using cursor P09BU2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV9Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09BU2_A719PrdNum[0] ;
         A396EmprCod = P09BU2_A396EmprCod[0] ;
         A718PrdNom = P09BU2_A718PrdNom[0] ;
         A685PrdCanRes = P09BU2_A685PrdCanRes[0] ;
         AV18GXLvl7 = (byte)(1) ;
         AV15Inc_obs = httpContext.getMessage( "Modifico Reserva desde MantenimientoRecetasProductos", "") + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Producto        = ", "") + GXutil.trim( A719PrdNum) + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Reserva Inicial = ", "") + GXutil.trim( GXutil.str( A685PrdCanRes, 12, 4)) + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Reserva IN      = ", "") + GXutil.trim( GXutil.str( AV10Canres, 8, 2)) + GXutil.newLine( ) ;
         AV15Inc_obs += httpContext.getMessage( "Reserva old     = ", "") + GXutil.trim( GXutil.str( AV11Canresold, 8, 2)) + GXutil.newLine( ) ;
         A685PrdCanRes = A685PrdCanRes.add(AV10Canres).subtract(AV11Canresold) ;
         /* Using cursor P09BU3 */
         pr_default.execute(1, new Object[] {A685PrdCanRes, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl7 == 0 )
      {
         System.out.println( httpContext.getMessage( "NO existe Produc", "") );
      }
      if ( ! (GXutil.strcmp("", AV15Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( AV8Emprcod, GXutil.substring( AV19Pgmname, 1, 10), AV14UsurCod, AV12Station, AV15Inc_obs, 99999999, (byte)(0), " ") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = mantenimientoderecetasregistro_modificocantreservada.this.AV8Emprcod;
      this.aP1[0] = mantenimientoderecetasregistro_modificocantreservada.this.AV9Prdnum;
      this.aP2[0] = mantenimientoderecetasregistro_modificocantreservada.this.AV10Canres;
      this.aP3[0] = mantenimientoderecetasregistro_modificocantreservada.this.AV11Canresold;
      Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientoderecetasregistro_modificocantreservada");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV15Inc_obs = "" ;
      scmdbuf = "" ;
      P09BU2_A719PrdNum = new String[] {""} ;
      P09BU2_A396EmprCod = new String[] {""} ;
      P09BU2_A718PrdNom = new String[] {""} ;
      P09BU2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A718PrdNom = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV19Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientoderecetasregistro_modificocantreservada__default(),
         new Object[] {
             new Object[] {
            P09BU2_A719PrdNum, P09BU2_A396EmprCod, P09BU2_A718PrdNom, P09BU2_A685PrdCanRes
            }
            , new Object[] {
            }
         }
      );
      AV19Pgmname = "MantenimientodeRecetasRegistro_ModificoCantReservada" ;
      /* GeneXus formulas. */
      AV19Pgmname = "MantenimientodeRecetasRegistro_ModificoCantReservada" ;
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl7 ;
   private short Gx_err ;
   private java.math.BigDecimal AV10Canres ;
   private java.math.BigDecimal AV11Canresold ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String AV8Emprcod ;
   private String AV9Prdnum ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String AV19Pgmname ;
   private String AV15Inc_obs ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09BU2_A719PrdNum ;
   private String[] P09BU2_A396EmprCod ;
   private String[] P09BU2_A718PrdNom ;
   private java.math.BigDecimal[] P09BU2_A685PrdCanRes ;
}

final  class mantenimientoderecetasregistro_modificocantreservada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BU2", "SELECT PrdNum, EmprCod, PrdNom, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09BU3", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

