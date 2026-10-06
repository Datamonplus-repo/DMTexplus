package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class diariodefacturacion_datos extends GXProcedure
{
   public diariodefacturacion_datos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( diariodefacturacion_datos.class ), "" );
   }

   public diariodefacturacion_datos( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          long aP1 ,
                          int aP2 ,
                          byte aP3 ,
                          String[] aP4 ,
                          byte aP5 ,
                          java.util.Date[] aP6 )
   {
      diariodefacturacion_datos.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String[] aP4 ,
                        byte aP5 ,
                        java.util.Date[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String[] aP4 ,
                             byte aP5 ,
                             java.util.Date[] aP6 ,
                             int[] aP7 )
   {
      diariodefacturacion_datos.this.AV8Emprcod = aP0;
      diariodefacturacion_datos.this.AV9FacAlbProcod = aP1;
      diariodefacturacion_datos.this.AV13FacBarCod = aP2;
      diariodefacturacion_datos.this.AV14FacBarReo = aP3;
      diariodefacturacion_datos.this.AV15FacBarpar = aP4[0];
      this.aP4 = aP4;
      diariodefacturacion_datos.this.AV12FacAlbTip = aP5;
      diariodefacturacion_datos.this.aP6 = aP6;
      diariodefacturacion_datos.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10ALbProfch = GXutil.nullDate() ;
      AV11BarAlbPie = 0 ;
      if ( AV12FacAlbTip == 1 )
      {
         /* Using cursor P0A6O2 */
         pr_default.execute(0, new Object[] {AV8Emprcod, Long.valueOf(AV9FacAlbProcod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A30AlbProCod = P0A6O2_A30AlbProCod[0] ;
            A396EmprCod = P0A6O2_A396EmprCod[0] ;
            A34AlbProfch = P0A6O2_A34AlbProfch[0] ;
            AV10ALbProfch = A34AlbProfch ;
            /* Using cursor P0A6O3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV13FacBarCod), Byte.valueOf(AV14FacBarReo), AV15FacBarpar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A130BarCodPar = P0A6O3_A130BarCodPar[0] ;
               A132BarCodReo = P0A6O3_A132BarCodReo[0] ;
               A129BarCod = P0A6O3_A129BarCod[0] ;
               A1265BarAlbPie = P0A6O3_A1265BarAlbPie[0] ;
               AV11BarAlbPie = A1265BarAlbPie ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P0A6O4 */
         pr_default.execute(2, new Object[] {AV8Emprcod, Long.valueOf(AV9FacAlbProcod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A14AlbComCod = P0A6O4_A14AlbComCod[0] ;
            A396EmprCod = P0A6O4_A396EmprCod[0] ;
            A17AlbComFch = P0A6O4_A17AlbComFch[0] ;
            AV10ALbProfch = A17AlbComFch ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = diariodefacturacion_datos.this.AV15FacBarpar;
      this.aP6[0] = diariodefacturacion_datos.this.AV10ALbProfch;
      this.aP7[0] = diariodefacturacion_datos.this.AV11BarAlbPie;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10ALbProfch = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0A6O2_A30AlbProCod = new long[1] ;
      P0A6O2_A396EmprCod = new String[] {""} ;
      P0A6O2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      P0A6O3_A396EmprCod = new String[] {""} ;
      P0A6O3_A30AlbProCod = new long[1] ;
      P0A6O3_A130BarCodPar = new String[] {""} ;
      P0A6O3_A132BarCodReo = new byte[1] ;
      P0A6O3_A129BarCod = new int[1] ;
      P0A6O3_A1265BarAlbPie = new int[1] ;
      A130BarCodPar = "" ;
      P0A6O4_A14AlbComCod = new int[1] ;
      P0A6O4_A396EmprCod = new String[] {""} ;
      P0A6O4_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A17AlbComFch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.diariodefacturacion_datos__default(),
         new Object[] {
             new Object[] {
            P0A6O2_A30AlbProCod, P0A6O2_A396EmprCod, P0A6O2_A34AlbProfch
            }
            , new Object[] {
            P0A6O3_A396EmprCod, P0A6O3_A30AlbProCod, P0A6O3_A130BarCodPar, P0A6O3_A132BarCodReo, P0A6O3_A129BarCod, P0A6O3_A1265BarAlbPie
            }
            , new Object[] {
            P0A6O4_A14AlbComCod, P0A6O4_A396EmprCod, P0A6O4_A17AlbComFch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14FacBarReo ;
   private byte AV12FacAlbTip ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV13FacBarCod ;
   private int AV11BarAlbPie ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A14AlbComCod ;
   private long AV9FacAlbProcod ;
   private long A30AlbProCod ;
   private String AV8Emprcod ;
   private String AV15FacBarpar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date AV10ALbProfch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private int[] aP7 ;
   private String[] aP4 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private long[] P0A6O2_A30AlbProCod ;
   private String[] P0A6O2_A396EmprCod ;
   private java.util.Date[] P0A6O2_A34AlbProfch ;
   private String[] P0A6O3_A396EmprCod ;
   private long[] P0A6O3_A30AlbProCod ;
   private String[] P0A6O3_A130BarCodPar ;
   private byte[] P0A6O3_A132BarCodReo ;
   private int[] P0A6O3_A129BarCod ;
   private int[] P0A6O3_A1265BarAlbPie ;
   private int[] P0A6O4_A14AlbComCod ;
   private String[] P0A6O4_A396EmprCod ;
   private java.util.Date[] P0A6O4_A17AlbComFch ;
}

final  class diariodefacturacion_datos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6O2", "SELECT AlbProCod, EmprCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A6O3", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A6O4", "SELECT AlbComCod, EmprCod, AlbComFch FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

