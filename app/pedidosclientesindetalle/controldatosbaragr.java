package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controldatosbaragr extends GXProcedure
{
   public controldatosbaragr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controldatosbaragr.class ), "" );
   }

   public controldatosbaragr( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int aP4 ,
                        String aP5 ,
                        int aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        java.math.BigDecimal aP10 ,
                        short aP11 ,
                        java.math.BigDecimal aP12 ,
                        String aP13 ,
                        String aP14 ,
                        String aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String aP5 ,
                             int aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             java.math.BigDecimal aP10 ,
                             short aP11 ,
                             java.math.BigDecimal aP12 ,
                             String aP13 ,
                             String aP14 ,
                             String aP15 )
   {
      controldatosbaragr.this.A396EmprCod = aP0;
      controldatosbaragr.this.A119BarAgrCod = aP1;
      controldatosbaragr.this.A124BarAgrReo = aP2;
      controldatosbaragr.this.A122BarAgrPar = aP3;
      controldatosbaragr.this.AV8CliCodAgr = aP4;
      controldatosbaragr.this.AV9ColNomAgr = aP5;
      controldatosbaragr.this.AV10ColNumAgr = aP6;
      controldatosbaragr.this.AV11BarAgrDNu = aP7;
      controldatosbaragr.this.AV12BarAgrSer = aP8;
      controldatosbaragr.this.AV13BarAgrDsc = aP9;
      controldatosbaragr.this.AV14KgmAgr = aP10;
      controldatosbaragr.this.AV15PieAgr = aP11;
      controldatosbaragr.this.AV16MtrAgr = aP12;
      controldatosbaragr.this.AV18usurcod = aP13;
      controldatosbaragr.this.AV19station = aP14;
      controldatosbaragr.this.AV20PgmnameIN = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17inc_obs = httpContext.getMessage( "Control BARAGR/ ", "") + " " + GXutil.trim( AV20PgmnameIN) + "/" ;
      /* Using cursor P0AJO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1508CliCodAgr = P0AJO2_A1508CliCodAgr[0] ;
         A1510ColNomAgr = P0AJO2_A1510ColNomAgr[0] ;
         A1512ColNumAgr = P0AJO2_A1512ColNumAgr[0] ;
         A1649BarAgrDNu = P0AJO2_A1649BarAgrDNu[0] ;
         A1245BarAgrSer = P0AJO2_A1245BarAgrSer[0] ;
         A1507BarAgrDsc = P0AJO2_A1507BarAgrDsc[0] ;
         A590KgmAgr = P0AJO2_A590KgmAgr[0] ;
         A671PieAgr = P0AJO2_A671PieAgr[0] ;
         A869MtrAgr = P0AJO2_A869MtrAgr[0] ;
         A129BarCod = P0AJO2_A129BarCod[0] ;
         A132BarCodReo = P0AJO2_A132BarCodReo[0] ;
         A130BarCodPar = P0AJO2_A130BarCodPar[0] ;
         AV17inc_obs += httpContext.getMessage( "Cliente ", "") + GXutil.trim( GXutil.str( A1508CliCodAgr, 6, 0)) + " " + GXutil.trim( GXutil.str( AV8CliCodAgr, 6, 0)) + "/" ;
         A1508CliCodAgr = AV8CliCodAgr ;
         AV17inc_obs += httpContext.getMessage( "color ", "") + GXutil.trim( A1510ColNomAgr) + " " + GXutil.trim( AV9ColNomAgr) + "/" ;
         A1510ColNomAgr = AV9ColNomAgr ;
         AV17inc_obs += httpContext.getMessage( "numero ", "") + GXutil.trim( GXutil.str( A1512ColNumAgr, 6, 0)) + " " + GXutil.trim( GXutil.str( AV10ColNumAgr, 6, 0)) + "/" ;
         A1512ColNumAgr = AV10ColNumAgr ;
         A1649BarAgrDNu = AV11BarAgrDNu ;
         AV17inc_obs += httpContext.getMessage( "Articulo ", "") + GXutil.trim( A1245BarAgrSer) + " " + GXutil.trim( AV12BarAgrSer) + "/" ;
         A1245BarAgrSer = AV12BarAgrSer ;
         AV17inc_obs += httpContext.getMessage( "Desc. ", "") + GXutil.trim( A1507BarAgrDsc) + " " + GXutil.trim( AV13BarAgrDsc) + "/" ;
         A1507BarAgrDsc = AV13BarAgrDsc ;
         A590KgmAgr = AV14KgmAgr ;
         AV17inc_obs += httpContext.getMessage( "kgs ", "") + GXutil.trim( GXutil.str( A590KgmAgr, 9, 2)) + " " + GXutil.trim( GXutil.str( AV14KgmAgr, 9, 2)) + "/" ;
         A671PieAgr = AV15PieAgr ;
         AV17inc_obs += httpContext.getMessage( "pzs ", "") + GXutil.trim( GXutil.str( A671PieAgr, 4, 0)) + " " + GXutil.trim( GXutil.str( AV15PieAgr, 4, 0)) + "/" ;
         A869MtrAgr = AV16MtrAgr ;
         AV17inc_obs += httpContext.getMessage( "mts ", "") + GXutil.trim( GXutil.str( A869MtrAgr, 9, 2)) + " " + GXutil.trim( GXutil.str( AV16MtrAgr, 9, 2)) + "/" ;
         AV17inc_obs += httpContext.getMessage( "Actualizo BARAGR", "") ;
         /* Using cursor P0AJO3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A1508CliCodAgr), A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1649BarAgrDNu, A1245BarAgrSer, A1507BarAgrDsc, A590KgmAgr, Short.valueOf(A671PieAgr), A869MtrAgr, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV17inc_obs, " ") != 0 )
      {
         new app.pinscrtinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CtrlBARAGR", ""), AV18usurcod, AV19station, AV17inc_obs, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.controldatosbaragr");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17inc_obs = "" ;
      scmdbuf = "" ;
      P0AJO2_A396EmprCod = new String[] {""} ;
      P0AJO2_A119BarAgrCod = new int[1] ;
      P0AJO2_A124BarAgrReo = new byte[1] ;
      P0AJO2_A122BarAgrPar = new String[] {""} ;
      P0AJO2_A1508CliCodAgr = new int[1] ;
      P0AJO2_A1510ColNomAgr = new String[] {""} ;
      P0AJO2_A1512ColNumAgr = new int[1] ;
      P0AJO2_A1649BarAgrDNu = new String[] {""} ;
      P0AJO2_A1245BarAgrSer = new String[] {""} ;
      P0AJO2_A1507BarAgrDsc = new String[] {""} ;
      P0AJO2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJO2_A671PieAgr = new short[1] ;
      P0AJO2_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJO2_A129BarCod = new int[1] ;
      P0AJO2_A132BarCodReo = new byte[1] ;
      P0AJO2_A130BarCodPar = new String[] {""} ;
      A1510ColNomAgr = "" ;
      A1649BarAgrDNu = "" ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.controldatosbaragr__default(),
         new Object[] {
             new Object[] {
            P0AJO2_A396EmprCod, P0AJO2_A119BarAgrCod, P0AJO2_A124BarAgrReo, P0AJO2_A122BarAgrPar, P0AJO2_A1508CliCodAgr, P0AJO2_A1510ColNomAgr, P0AJO2_A1512ColNumAgr, P0AJO2_A1649BarAgrDNu, P0AJO2_A1245BarAgrSer, P0AJO2_A1507BarAgrDsc,
            P0AJO2_A590KgmAgr, P0AJO2_A671PieAgr, P0AJO2_A869MtrAgr, P0AJO2_A129BarCod, P0AJO2_A132BarCodReo, P0AJO2_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private byte A132BarCodReo ;
   private short AV15PieAgr ;
   private short A671PieAgr ;
   private short Gx_err ;
   private int A119BarAgrCod ;
   private int AV8CliCodAgr ;
   private int AV10ColNumAgr ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A129BarCod ;
   private java.math.BigDecimal AV14KgmAgr ;
   private java.math.BigDecimal AV16MtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private String AV9ColNomAgr ;
   private String AV11BarAgrDNu ;
   private String AV12BarAgrSer ;
   private String AV13BarAgrDsc ;
   private String AV18usurcod ;
   private String AV19station ;
   private String scmdbuf ;
   private String A1510ColNomAgr ;
   private String A1649BarAgrDNu ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String A130BarCodPar ;
   private String AV20PgmnameIN ;
   private String AV17inc_obs ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJO2_A396EmprCod ;
   private int[] P0AJO2_A119BarAgrCod ;
   private byte[] P0AJO2_A124BarAgrReo ;
   private String[] P0AJO2_A122BarAgrPar ;
   private int[] P0AJO2_A1508CliCodAgr ;
   private String[] P0AJO2_A1510ColNomAgr ;
   private int[] P0AJO2_A1512ColNumAgr ;
   private String[] P0AJO2_A1649BarAgrDNu ;
   private String[] P0AJO2_A1245BarAgrSer ;
   private String[] P0AJO2_A1507BarAgrDsc ;
   private java.math.BigDecimal[] P0AJO2_A590KgmAgr ;
   private short[] P0AJO2_A671PieAgr ;
   private java.math.BigDecimal[] P0AJO2_A869MtrAgr ;
   private int[] P0AJO2_A129BarCod ;
   private byte[] P0AJO2_A132BarCodReo ;
   private String[] P0AJO2_A130BarCodPar ;
}

final  class controldatosbaragr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJO2", "SELECT EmprCod, BarAgrCod, BarAgrReo, BarAgrPar, CliCodAgr, ColNomAgr, ColNumAgr, BarAgrDNu, BarAgrSer, BarAgrDsc, KgmAgr, PieAgr, MtrAgr, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ? ORDER BY EmprCod, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AJO3", "UPDATE TXPBARAGR SET CliCodAgr=?, ColNomAgr=?, ColNumAgr=?, BarAgrDNu=?, BarAgrSer=?, BarAgrDsc=?, KgmAgr=?, PieAgr=?, MtrAgr=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 13);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               return;
      }
   }

}

