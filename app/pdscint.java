package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdscint extends GXProcedure
{
   public pdscint( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdscint.class ), "" );
   }

   public pdscint( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 )
   {
      pdscint.this.aP2 = new String[] {""};
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
      pdscint.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdscint.this.A583IntCod = aP1[0];
      this.aP1 = aP1;
      pdscint.this.AV9IntDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Flag = (byte)(0) ;
      /* Using cursor P00IO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A584IntDsc = P00IO2_A584IntDsc[0] ;
         n584IntDsc = P00IO2_n584IntDsc[0] ;
         AV8Flag = (byte)(1) ;
         AV9IntDsc = A584IntDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdscint.this.A396EmprCod;
      this.aP1[0] = pdscint.this.A583IntCod;
      this.aP2[0] = pdscint.this.AV9IntDsc;
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
      P00IO2_A396EmprCod = new String[] {""} ;
      P00IO2_A583IntCod = new byte[1] ;
      P00IO2_A584IntDsc = new String[] {""} ;
      P00IO2_n584IntDsc = new boolean[] {false} ;
      A584IntDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdscint__default(),
         new Object[] {
             new Object[] {
            P00IO2_A396EmprCod, P00IO2_A583IntCod, P00IO2_A584IntDsc, P00IO2_n584IntDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte AV8Flag ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9IntDsc ;
   private String scmdbuf ;
   private String A584IntDsc ;
   private boolean n584IntDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00IO2_A396EmprCod ;
   private byte[] P00IO2_A583IntCod ;
   private String[] P00IO2_A584IntDsc ;
   private boolean[] P00IO2_n584IntDsc ;
}

final  class pdscint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00IO2", "SELECT EmprCod, IntCod, IntDsc FROM TXPINTENS WHERE EmprCod = ? and IntCod = ? ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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

