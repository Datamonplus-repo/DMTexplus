package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phayhdr extends GXProcedure
{
   public phayhdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phayhdr.class ), "" );
   }

   public phayhdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      phayhdr.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      phayhdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phayhdr.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      phayhdr.this.AV8HayHdr = aP2[0];
      this.aP2 = aP2;
      phayhdr.this.AV9Hd = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HayHdr = (byte)(0) ;
      AV9Hd = " " ;
      /* Using cursor P04PQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A212BarSer = P04PQ2_A212BarSer[0] ;
         A130BarCodPar = P04PQ2_A130BarCodPar[0] ;
         A132BarCodReo = P04PQ2_A132BarCodReo[0] ;
         A129BarCod = P04PQ2_A129BarCod[0] ;
         AV8HayHdr = (byte)(1) ;
         AV9Hd = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phayhdr.this.A396EmprCod;
      this.aP1[0] = phayhdr.this.A361DisCod;
      this.aP2[0] = phayhdr.this.AV8HayHdr;
      this.aP3[0] = phayhdr.this.AV9Hd;
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
      P04PQ2_A396EmprCod = new String[] {""} ;
      P04PQ2_A361DisCod = new int[1] ;
      P04PQ2_A212BarSer = new String[] {""} ;
      P04PQ2_A130BarCodPar = new String[] {""} ;
      P04PQ2_A132BarCodReo = new byte[1] ;
      P04PQ2_A129BarCod = new int[1] ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phayhdr__default(),
         new Object[] {
             new Object[] {
            P04PQ2_A396EmprCod, P04PQ2_A361DisCod, P04PQ2_A212BarSer, P04PQ2_A130BarCodPar, P04PQ2_A132BarCodReo, P04PQ2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8HayHdr ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV9Hd ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04PQ2_A396EmprCod ;
   private int[] P04PQ2_A361DisCod ;
   private String[] P04PQ2_A212BarSer ;
   private String[] P04PQ2_A130BarCodPar ;
   private byte[] P04PQ2_A132BarCodReo ;
   private int[] P04PQ2_A129BarCod ;
}

final  class phayhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04PQ2", "SELECT * FROM (SELECT EmprCod, DisCod, BarSer, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               return;
      }
   }

}

