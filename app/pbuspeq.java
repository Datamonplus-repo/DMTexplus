package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuspeq extends GXProcedure
{
   public pbuspeq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuspeq.class ), "" );
   }

   public pbuspeq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           short[] aP3 )
   {
      pbuspeq.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 ,
                             byte[] aP4 )
   {
      pbuspeq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuspeq.this.A2574GrpDibCod = aP1[0];
      this.aP1 = aP1;
      pbuspeq.this.AV15CliCodC = aP2[0];
      this.aP2 = aP2;
      pbuspeq.this.AV16GrabCodC = aP3[0];
      this.aP3 = aP3;
      pbuspeq.this.AV17TipMaqCodC = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00YC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2574GrpDibCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00YC2_A252CliCod[0] ;
         n252CliCod = P00YC2_n252CliCod[0] ;
         A1005GrabCod = P00YC2_A1005GrabCod[0] ;
         n1005GrabCod = P00YC2_n1005GrabCod[0] ;
         A3911TipMqnCod = P00YC2_A3911TipMqnCod[0] ;
         n3911TipMqnCod = P00YC2_n3911TipMqnCod[0] ;
         AV15CliCodC = A252CliCod ;
         AV16GrabCodC = A1005GrabCod ;
         AV17TipMaqCodC = A3911TipMqnCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuspeq.this.A396EmprCod;
      this.aP1[0] = pbuspeq.this.A2574GrpDibCod;
      this.aP2[0] = pbuspeq.this.AV15CliCodC;
      this.aP3[0] = pbuspeq.this.AV16GrabCodC;
      this.aP4[0] = pbuspeq.this.AV17TipMaqCodC;
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
      P00YC2_A396EmprCod = new String[] {""} ;
      P00YC2_A2574GrpDibCod = new int[1] ;
      P00YC2_A252CliCod = new int[1] ;
      P00YC2_n252CliCod = new boolean[] {false} ;
      P00YC2_A1005GrabCod = new short[1] ;
      P00YC2_n1005GrabCod = new boolean[] {false} ;
      P00YC2_A3911TipMqnCod = new byte[1] ;
      P00YC2_n3911TipMqnCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuspeq__default(),
         new Object[] {
             new Object[] {
            P00YC2_A396EmprCod, P00YC2_A2574GrpDibCod, P00YC2_A252CliCod, P00YC2_n252CliCod, P00YC2_A1005GrabCod, P00YC2_n1005GrabCod, P00YC2_A3911TipMqnCod, P00YC2_n3911TipMqnCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17TipMaqCodC ;
   private byte A3911TipMqnCod ;
   private short AV16GrabCodC ;
   private short A1005GrabCod ;
   private short Gx_err ;
   private int A2574GrpDibCod ;
   private int AV15CliCodC ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n252CliCod ;
   private boolean n1005GrabCod ;
   private boolean n3911TipMqnCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YC2_A396EmprCod ;
   private int[] P00YC2_A2574GrpDibCod ;
   private int[] P00YC2_A252CliCod ;
   private boolean[] P00YC2_n252CliCod ;
   private short[] P00YC2_A1005GrabCod ;
   private boolean[] P00YC2_n1005GrabCod ;
   private byte[] P00YC2_A3911TipMqnCod ;
   private boolean[] P00YC2_n3911TipMqnCod ;
}

final  class pbuspeq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YC2", "SELECT EmprCod, GrpDibCod, CliCod, GrabCod, TipMqnCod FROM TXPCGRPEQ WHERE EmprCod = ? and GrpDibCod = ? ORDER BY EmprCod, GrpDibCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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

