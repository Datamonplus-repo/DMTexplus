package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestcil2 extends GXProcedure
{
   public pestcil2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestcil2.class ), "" );
   }

   public pestcil2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 )
   {
      pestcil2.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 )
   {
      pestcil2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestcil2.this.A10790EstCilCod = aP1[0];
      this.aP1 = aP1;
      pestcil2.this.AV8EstCilDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EstCilDsc = "" ;
      /* Using cursor P043Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A10790EstCilCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10791EstCilDsc = P043Q2_A10791EstCilDsc[0] ;
         n10791EstCilDsc = P043Q2_n10791EstCilDsc[0] ;
         AV8EstCilDsc = A10791EstCilDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestcil2.this.A396EmprCod;
      this.aP1[0] = pestcil2.this.A10790EstCilCod;
      this.aP2[0] = pestcil2.this.AV8EstCilDsc;
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
      P043Q2_A396EmprCod = new String[] {""} ;
      P043Q2_A10790EstCilCod = new byte[1] ;
      P043Q2_A10791EstCilDsc = new String[] {""} ;
      P043Q2_n10791EstCilDsc = new boolean[] {false} ;
      A10791EstCilDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestcil2__default(),
         new Object[] {
             new Object[] {
            P043Q2_A396EmprCod, P043Q2_A10790EstCilCod, P043Q2_A10791EstCilDsc, P043Q2_n10791EstCilDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10790EstCilCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8EstCilDsc ;
   private String scmdbuf ;
   private String A10791EstCilDsc ;
   private boolean n10791EstCilDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P043Q2_A396EmprCod ;
   private byte[] P043Q2_A10790EstCilCod ;
   private String[] P043Q2_A10791EstCilDsc ;
   private boolean[] P043Q2_n10791EstCilDsc ;
}

final  class pestcil2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P043Q2", "SELECT EmprCod, EstCilCod, EstCilDsc FROM TXPESTCIL WHERE EmprCod = ? and EstCilCod = ? ORDER BY EmprCod, EstCilCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

