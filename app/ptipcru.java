package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptipcru extends GXProcedure
{
   public ptipcru( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptipcru.class ), "" );
   }

   public ptipcru( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      ptipcru.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      ptipcru.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptipcru.this.A5874CruCod = aP1[0];
      this.aP1 = aP1;
      ptipcru.this.AV9CruDsc = aP2[0];
      this.aP2 = aP2;
      ptipcru.this.AV8OkCrudo = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8OkCrudo = (byte)(0) ;
      AV9CruDsc = "" ;
      /* Using cursor P02CT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5874CruCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5875CruDsc = P02CT2_A5875CruDsc[0] ;
         n5875CruDsc = P02CT2_n5875CruDsc[0] ;
         AV9CruDsc = A5875CruDsc ;
         AV8OkCrudo = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptipcru.this.A396EmprCod;
      this.aP1[0] = ptipcru.this.A5874CruCod;
      this.aP2[0] = ptipcru.this.AV9CruDsc;
      this.aP3[0] = ptipcru.this.AV8OkCrudo;
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
      P02CT2_A396EmprCod = new String[] {""} ;
      P02CT2_A5874CruCod = new int[1] ;
      P02CT2_A5875CruDsc = new String[] {""} ;
      P02CT2_n5875CruDsc = new boolean[] {false} ;
      A5875CruDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptipcru__default(),
         new Object[] {
             new Object[] {
            P02CT2_A396EmprCod, P02CT2_A5874CruCod, P02CT2_A5875CruDsc, P02CT2_n5875CruDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8OkCrudo ;
   private short Gx_err ;
   private int A5874CruCod ;
   private String A396EmprCod ;
   private String AV9CruDsc ;
   private String scmdbuf ;
   private String A5875CruDsc ;
   private boolean n5875CruDsc ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CT2_A396EmprCod ;
   private int[] P02CT2_A5874CruCod ;
   private String[] P02CT2_A5875CruDsc ;
   private boolean[] P02CT2_n5875CruDsc ;
}

final  class ptipcru__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CT2", "SELECT EmprCod, CruCod, CruDsc FROM TXPCruTip WHERE EmprCod = ? and CruCod = ? ORDER BY EmprCod, CruCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

