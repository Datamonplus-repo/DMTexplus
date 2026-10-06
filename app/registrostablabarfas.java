package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrostablabarfas extends GXProcedure
{
   public registrostablabarfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrostablabarfas.class ), "" );
   }

   public registrostablabarfas( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      registrostablabarfas.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             long[] aP4 )
   {
      registrostablabarfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      registrostablabarfas.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      registrostablabarfas.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      registrostablabarfas.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      registrostablabarfas.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8NumeroRegistros = 0 ;
      /* Optimized group. */
      /* Using cursor P097V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      cV8NumeroRegistros = P097V2_AV8NumeroRegistros[0] ;
      pr_default.close(0);
      AV8NumeroRegistros = (long)(AV8NumeroRegistros+cV8NumeroRegistros*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = registrostablabarfas.this.A396EmprCod;
      this.aP1[0] = registrostablabarfas.this.A129BarCod;
      this.aP2[0] = registrostablabarfas.this.A132BarCodReo;
      this.aP3[0] = registrostablabarfas.this.A130BarCodPar;
      this.aP4[0] = registrostablabarfas.this.AV8NumeroRegistros;
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
      P097V2_AV8NumeroRegistros = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.registrostablabarfas__default(),
         new Object[] {
             new Object[] {
            P097V2_AV8NumeroRegistros
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
   private String scmdbuf ;
   private long[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private long[] P097V2_AV8NumeroRegistros ;
}

final  class registrostablabarfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097V2", "SELECT COUNT(*) FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

