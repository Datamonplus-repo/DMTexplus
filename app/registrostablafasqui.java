package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrostablafasqui extends GXProcedure
{
   public registrostablafasqui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrostablafasqui.class ), "" );
   }

   public registrostablafasqui( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 )
   {
      registrostablafasqui.this.aP5 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        long[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             long[] aP5 )
   {
      registrostablafasqui.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      registrostablafasqui.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      registrostablafasqui.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      registrostablafasqui.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      registrostablafasqui.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      registrostablafasqui.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8NumeroRegistros = 0 ;
      /* Optimized group. */
      /* Using cursor P09BE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      cV8NumeroRegistros = P09BE2_AV8NumeroRegistros[0] ;
      pr_default.close(0);
      AV8NumeroRegistros = (long)(AV8NumeroRegistros+cV8NumeroRegistros*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = registrostablafasqui.this.A396EmprCod;
      this.aP1[0] = registrostablafasqui.this.A129BarCod;
      this.aP2[0] = registrostablafasqui.this.A132BarCodReo;
      this.aP3[0] = registrostablafasqui.this.A130BarCodPar;
      this.aP4[0] = registrostablafasqui.this.A758ProCod;
      this.aP5[0] = registrostablafasqui.this.AV8NumeroRegistros;
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
      P09BE2_AV8NumeroRegistros = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.registrostablafasqui__default(),
         new Object[] {
             new Object[] {
            P09BE2_AV8NumeroRegistros
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long AV8NumeroRegistros ;
   private long cV8NumeroRegistros ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private long[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P09BE2_AV8NumeroRegistros ;
}

final  class registrostablafasqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BE2", "SELECT COUNT(*) FROM (TXPFASQUI T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ?) AND (T2.BarFasAcab = 'S') AND (T2.BarFasFor = 'S') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

