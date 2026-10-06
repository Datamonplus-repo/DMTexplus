package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelalbe extends GXProcedure
{
   public pdelalbe( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelalbe.class ), "" );
   }

   public pdelalbe( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pdelalbe.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pdelalbe.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelalbe.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00W82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1265BarAlbPie = P00W82_A1265BarAlbPie[0] ;
         A129BarCod = P00W82_A129BarCod[0] ;
         A132BarCodReo = P00W82_A132BarCodReo[0] ;
         A130BarCodPar = P00W82_A130BarCodPar[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A30AlbProCod ;
         GXv_int3[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char5[0] = A130BarCodPar ;
         new app.peliho4(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5) ;
         pdelalbe.this.A396EmprCod = GXv_char1[0] ;
         pdelalbe.this.A30AlbProCod = GXv_int2[0] ;
         pdelalbe.this.A129BarCod = GXv_int3[0] ;
         pdelalbe.this.A132BarCodReo = GXv_int4[0] ;
         pdelalbe.this.A130BarCodPar = GXv_char5[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P00W83 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelalbe.this.A396EmprCod;
      this.aP1[0] = pdelalbe.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelalbe");
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
      P00W82_A396EmprCod = new String[] {""} ;
      P00W82_A30AlbProCod = new long[1] ;
      P00W82_A1265BarAlbPie = new int[1] ;
      P00W82_A129BarCod = new int[1] ;
      P00W82_A132BarCodReo = new byte[1] ;
      P00W82_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelalbe__default(),
         new Object[] {
             new Object[] {
            P00W82_A396EmprCod, P00W82_A30AlbProCod, P00W82_A1265BarAlbPie, P00W82_A129BarCod, P00W82_A132BarCodReo, P00W82_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int4[] ;
   private short Gx_err ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GXv_int3[] ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00W82_A396EmprCod ;
   private long[] P00W82_A30AlbProCod ;
   private int[] P00W82_A1265BarAlbPie ;
   private int[] P00W82_A129BarCod ;
   private byte[] P00W82_A132BarCodReo ;
   private String[] P00W82_A130BarCodPar ;
}

final  class pdelalbe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00W82", "SELECT EmprCod, AlbProCod, BarAlbPie, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00W83", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               return;
      }
   }

}

