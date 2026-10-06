package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putil24 extends GXProcedure
{
   public putil24( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putil24.class ), "" );
   }

   public putil24( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      putil24.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      putil24.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      putil24.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      putil24.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      putil24.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      putil24.this.AV8DisCod = aP4[0];
      this.aP4 = aP4;
      putil24.this.AV9Err_hdr = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Err_hdr = (byte)(0) ;
      /* Using cursor P00UU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00UU2_A361DisCod[0] ;
         AV8DisCod = A361DisCod ;
         AV9Err_hdr = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = putil24.this.A396EmprCod;
      this.aP1[0] = putil24.this.A129BarCod;
      this.aP2[0] = putil24.this.A132BarCodReo;
      this.aP3[0] = putil24.this.A130BarCodPar;
      this.aP4[0] = putil24.this.AV8DisCod;
      this.aP5[0] = putil24.this.AV9Err_hdr;
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
      P00UU2_A396EmprCod = new String[] {""} ;
      P00UU2_A129BarCod = new int[1] ;
      P00UU2_A132BarCodReo = new byte[1] ;
      P00UU2_A130BarCodPar = new String[] {""} ;
      P00UU2_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.putil24__default(),
         new Object[] {
             new Object[] {
            P00UU2_A396EmprCod, P00UU2_A129BarCod, P00UU2_A132BarCodReo, P00UU2_A130BarCodPar, P00UU2_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9Err_hdr ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8DisCod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00UU2_A396EmprCod ;
   private int[] P00UU2_A129BarCod ;
   private byte[] P00UU2_A132BarCodReo ;
   private String[] P00UU2_A130BarCodPar ;
   private int[] P00UU2_A361DisCod ;
}

final  class putil24__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00UU2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

