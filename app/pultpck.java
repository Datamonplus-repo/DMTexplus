package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pultpck extends GXProcedure
{
   public pultpck( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pultpck.class ), "" );
   }

   public pultpck( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pultpck.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pultpck.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pultpck.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pultpck.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pultpck.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pultpck.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pultpck.this.AV8UltCaja = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01G52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3622AlbPckCaj = P01G52_A3622AlbPckCaj[0] ;
         n3622AlbPckCaj = P01G52_n3622AlbPckCaj[0] ;
         A3621AlbPckLin = P01G52_A3621AlbPckLin[0] ;
         AV8UltCaja = A3622AlbPckCaj ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV9ContCaja = (long)(GXutil.lval( AV8UltCaja)+1) ;
      AV8UltCaja = GXutil.trim( GXutil.str( AV9ContCaja, 9, 0)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pultpck.this.A396EmprCod;
      this.aP1[0] = pultpck.this.A30AlbProCod;
      this.aP2[0] = pultpck.this.A129BarCod;
      this.aP3[0] = pultpck.this.A132BarCodReo;
      this.aP4[0] = pultpck.this.A130BarCodPar;
      this.aP5[0] = pultpck.this.AV8UltCaja;
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
      P01G52_A396EmprCod = new String[] {""} ;
      P01G52_A30AlbProCod = new long[1] ;
      P01G52_A129BarCod = new int[1] ;
      P01G52_A132BarCodReo = new byte[1] ;
      P01G52_A130BarCodPar = new String[] {""} ;
      P01G52_A3622AlbPckCaj = new String[] {""} ;
      P01G52_n3622AlbPckCaj = new boolean[] {false} ;
      P01G52_A3621AlbPckLin = new short[1] ;
      A3622AlbPckCaj = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pultpck__default(),
         new Object[] {
             new Object[] {
            P01G52_A396EmprCod, P01G52_A30AlbProCod, P01G52_A129BarCod, P01G52_A132BarCodReo, P01G52_A130BarCodPar, P01G52_A3622AlbPckCaj, P01G52_n3622AlbPckCaj, P01G52_A3621AlbPckLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A3621AlbPckLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private long AV9ContCaja ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8UltCaja ;
   private String scmdbuf ;
   private String A3622AlbPckCaj ;
   private boolean n3622AlbPckCaj ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01G52_A396EmprCod ;
   private long[] P01G52_A30AlbProCod ;
   private int[] P01G52_A129BarCod ;
   private byte[] P01G52_A132BarCodReo ;
   private String[] P01G52_A130BarCodPar ;
   private String[] P01G52_A3622AlbPckCaj ;
   private boolean[] P01G52_n3622AlbPckCaj ;
   private short[] P01G52_A3621AlbPckLin ;
}

final  class pultpck__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01G52", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckCaj, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

