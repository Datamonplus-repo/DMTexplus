package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptipest extends GXProcedure
{
   public ptipest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptipest.class ), "" );
   }

   public ptipest( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 )
   {
      ptipest.this.aP2 = new String[] {""};
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
      ptipest.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptipest.this.A5020TipEstCod = aP1[0];
      this.aP1 = aP1;
      ptipest.this.AV16TipEstDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01HN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A5020TipEstCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5021TipEstDsc = P01HN2_A5021TipEstDsc[0] ;
         n5021TipEstDsc = P01HN2_n5021TipEstDsc[0] ;
         AV16TipEstDsc = A5021TipEstDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptipest.this.A396EmprCod;
      this.aP1[0] = ptipest.this.A5020TipEstCod;
      this.aP2[0] = ptipest.this.AV16TipEstDsc;
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
      P01HN2_A396EmprCod = new String[] {""} ;
      P01HN2_A5020TipEstCod = new byte[1] ;
      P01HN2_A5021TipEstDsc = new String[] {""} ;
      P01HN2_n5021TipEstDsc = new boolean[] {false} ;
      A5021TipEstDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptipest__default(),
         new Object[] {
             new Object[] {
            P01HN2_A396EmprCod, P01HN2_A5020TipEstCod, P01HN2_A5021TipEstDsc, P01HN2_n5021TipEstDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5020TipEstCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV16TipEstDsc ;
   private String scmdbuf ;
   private String A5021TipEstDsc ;
   private boolean n5021TipEstDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01HN2_A396EmprCod ;
   private byte[] P01HN2_A5020TipEstCod ;
   private String[] P01HN2_A5021TipEstDsc ;
   private boolean[] P01HN2_n5021TipEstDsc ;
}

final  class ptipest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01HN2", "SELECT EmprCod, TipEstCod, TipEstDsc FROM TXPTIPEST WHERE EmprCod = ? and TipEstCod = ? ORDER BY EmprCod, TipEstCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

