package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdltlanyad extends GXProcedure
{
   public pdltlanyad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdltlanyad.class ), "" );
   }

   public pdltlanyad( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pdltlanyad.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pdltlanyad.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdltlanyad.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdltlanyad.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdltlanyad.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdltlanyad.this.A2808RecLinMAL = aP4[0];
      this.aP4 = aP4;
      pdltlanyad.this.A1377RecNumAny = aP5[0];
      this.aP5 = aP5;
      pdltlanyad.this.A719PrdNum = aP6[0];
      this.aP6 = aP6;
      pdltlanyad.this.AV8usurcod = aP7[0];
      this.aP7 = aP7;
      pdltlanyad.this.AV9station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P056I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A718PrdNom = P056I2_A718PrdNom[0] ;
         A1378PrdCFin = P056I2_A1378PrdCFin[0] ;
         n1378PrdCFin = P056I2_n1378PrdCFin[0] ;
         A718PrdNom = P056I2_A718PrdNom[0] ;
         AV10Inc_obs = httpContext.getMessage( "Eliminacion tabla LANYAD", "") + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Hdr   =", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
         AV10Inc_obs += "#     =" + GXutil.str( A2808RecLinMAL, 4, 0) + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Linea =", "") + GXutil.str( A1377RecNumAny, 2, 0) + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Producto =", "") + A719PrdNum + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Cantidad =", "") + GXutil.str( A1378PrdCFin, 11, 3) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV14Pgmname, 1, 10), AV8usurcod, AV9station, AV10Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P056I3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdltlanyad.this.A396EmprCod;
      this.aP1[0] = pdltlanyad.this.A129BarCod;
      this.aP2[0] = pdltlanyad.this.A132BarCodReo;
      this.aP3[0] = pdltlanyad.this.A130BarCodPar;
      this.aP4[0] = pdltlanyad.this.A2808RecLinMAL;
      this.aP5[0] = pdltlanyad.this.A1377RecNumAny;
      this.aP6[0] = pdltlanyad.this.A719PrdNum;
      this.aP7[0] = pdltlanyad.this.AV8usurcod;
      this.aP8[0] = pdltlanyad.this.AV9station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdltlanyad");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P056I2_A396EmprCod = new String[] {""} ;
      P056I2_A129BarCod = new int[1] ;
      P056I2_A132BarCodReo = new byte[1] ;
      P056I2_A130BarCodPar = new String[] {""} ;
      P056I2_A2808RecLinMAL = new short[1] ;
      P056I2_A1377RecNumAny = new byte[1] ;
      P056I2_A719PrdNum = new String[] {""} ;
      P056I2_A718PrdNom = new String[] {""} ;
      P056I2_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056I2_n1378PrdCFin = new boolean[] {false} ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      AV10Inc_obs = "" ;
      AV14Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdltlanyad__default(),
         new Object[] {
             new Object[] {
            P056I2_A396EmprCod, P056I2_A129BarCod, P056I2_A132BarCodReo, P056I2_A130BarCodPar, P056I2_A2808RecLinMAL, P056I2_A1377RecNumAny, P056I2_A719PrdNum, P056I2_A718PrdNom, P056I2_A1378PrdCFin, P056I2_n1378PrdCFin
            }
            , new Object[] {
            }
         }
      );
      AV14Pgmname = "PDltLanyad" ;
      /* GeneXus formulas. */
      AV14Pgmname = "PDltLanyad" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1377RecNumAny ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A1378PrdCFin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String AV8usurcod ;
   private String AV9station ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String AV14Pgmname ;
   private boolean n1378PrdCFin ;
   private String AV10Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P056I2_A396EmprCod ;
   private int[] P056I2_A129BarCod ;
   private byte[] P056I2_A132BarCodReo ;
   private String[] P056I2_A130BarCodPar ;
   private short[] P056I2_A2808RecLinMAL ;
   private byte[] P056I2_A1377RecNumAny ;
   private String[] P056I2_A719PrdNum ;
   private String[] P056I2_A718PrdNom ;
   private java.math.BigDecimal[] P056I2_A1378PrdCFin ;
   private boolean[] P056I2_n1378PrdCFin ;
}

final  class pdltlanyad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P056I2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum, T2.PrdNom, T1.PrdCFin FROM (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ? and T1.RecNumAny = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P056I3", "DELETE FROM TXPLANYAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMAL = ? AND RecNumAny = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

