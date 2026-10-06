package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbartrz extends GXProcedure
{
   public pbartrz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbartrz.class ), "" );
   }

   public pbartrz( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           byte[] aP5 )
   {
      pbartrz.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pbartrz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbartrz.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbartrz.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbartrz.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbartrz.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pbartrz.this.AV9ExisteAlb = aP5[0];
      this.aP5 = aP5;
      pbartrz.this.AV8OkTrozos = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ExisteAlb = (byte)(0) ;
      AV8OkTrozos = (byte)(1) ;
      /* Using cursor P02OY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1270AlbPMtrEnt = P02OY2_A1270AlbPMtrEnt[0] ;
         A30AlbProCod = P02OY2_A30AlbProCod[0] ;
         AV9ExisteAlb = (byte)(1) ;
         AV8OkTrozos = (byte)(0) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbartrz.this.A396EmprCod;
      this.aP1[0] = pbartrz.this.A129BarCod;
      this.aP2[0] = pbartrz.this.A132BarCodReo;
      this.aP3[0] = pbartrz.this.A130BarCodPar;
      this.aP4[0] = pbartrz.this.A200BarPieCod;
      this.aP5[0] = pbartrz.this.AV9ExisteAlb;
      this.aP6[0] = pbartrz.this.AV8OkTrozos;
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
      P02OY2_A396EmprCod = new String[] {""} ;
      P02OY2_A129BarCod = new int[1] ;
      P02OY2_A132BarCodReo = new byte[1] ;
      P02OY2_A130BarCodPar = new String[] {""} ;
      P02OY2_A200BarPieCod = new String[] {""} ;
      P02OY2_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OY2_A30AlbProCod = new long[1] ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbartrz__default(),
         new Object[] {
             new Object[] {
            P02OY2_A396EmprCod, P02OY2_A129BarCod, P02OY2_A132BarCodReo, P02OY2_A130BarCodPar, P02OY2_A200BarPieCod, P02OY2_A1270AlbPMtrEnt, P02OY2_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9ExisteAlb ;
   private byte AV8OkTrozos ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02OY2_A396EmprCod ;
   private int[] P02OY2_A129BarCod ;
   private byte[] P02OY2_A132BarCodReo ;
   private String[] P02OY2_A130BarCodPar ;
   private String[] P02OY2_A200BarPieCod ;
   private java.math.BigDecimal[] P02OY2_A1270AlbPMtrEnt ;
   private long[] P02OY2_A30AlbProCod ;
}

final  class pbartrz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02OY2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPMtrEnt, AlbProCod FROM TXPLALPRD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

