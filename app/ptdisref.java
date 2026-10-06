package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptdisref extends GXProcedure
{
   public ptdisref( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptdisref.class ), "" );
   }

   public ptdisref( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      ptdisref.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      ptdisref.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptdisref.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      ptdisref.this.AV8Ok = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = (byte)(0) ;
      /* Using cursor P04332 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3608DisRefAlbR = P04332_A3608DisRefAlbR[0] ;
         n3608DisRefAlbR = P04332_n3608DisRefAlbR[0] ;
         A3398DisRefBarC = P04332_A3398DisRefBarC[0] ;
         A3399DisRefBCRe = P04332_A3399DisRefBCRe[0] ;
         A3400DisRefBCPa = P04332_A3400DisRefBCPa[0] ;
         A3607DisRefBPie = P04332_A3607DisRefBPie[0] ;
         AV8Ok = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptdisref.this.A396EmprCod;
      this.aP1[0] = ptdisref.this.A361DisCod;
      this.aP2[0] = ptdisref.this.AV8Ok;
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
      P04332_A396EmprCod = new String[] {""} ;
      P04332_A361DisCod = new int[1] ;
      P04332_A3608DisRefAlbR = new int[1] ;
      P04332_n3608DisRefAlbR = new boolean[] {false} ;
      P04332_A3398DisRefBarC = new int[1] ;
      P04332_A3399DisRefBCRe = new byte[1] ;
      P04332_A3400DisRefBCPa = new String[] {""} ;
      P04332_A3607DisRefBPie = new String[] {""} ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptdisref__default(),
         new Object[] {
             new Object[] {
            P04332_A396EmprCod, P04332_A361DisCod, P04332_A3608DisRefAlbR, P04332_n3608DisRefAlbR, P04332_A3398DisRefBarC, P04332_A3399DisRefBCRe, P04332_A3400DisRefBCPa, P04332_A3607DisRefBPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Ok ;
   private byte A3399DisRefBCRe ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A3608DisRefAlbR ;
   private int A3398DisRefBarC ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private boolean n3608DisRefAlbR ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04332_A396EmprCod ;
   private int[] P04332_A361DisCod ;
   private int[] P04332_A3608DisRefAlbR ;
   private boolean[] P04332_n3608DisRefAlbR ;
   private int[] P04332_A3398DisRefBarC ;
   private byte[] P04332_A3399DisRefBCRe ;
   private String[] P04332_A3400DisRefBCPa ;
   private String[] P04332_A3607DisRefBPie ;
}

final  class ptdisref__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04332", "SELECT EmprCod, DisCod, DisRefAlbR, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
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

