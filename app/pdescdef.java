package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdescdef extends GXProcedure
{
   public pdescdef( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdescdef.class ), "" );
   }

   public pdescdef( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pdescdef.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      pdescdef.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdescdef.this.A833TipDefCod = aP1[0];
      this.aP1 = aP1;
      pdescdef.this.AV15TipDefDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15TipDefDsc = " " ;
      AV18GXLvl4 = (byte)(0) ;
      /* Using cursor P03I22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A833TipDefCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A834TipDefDsc = P03I22_A834TipDefDsc[0] ;
         n834TipDefDsc = P03I22_n834TipDefDsc[0] ;
         AV18GXLvl4 = (byte)(1) ;
         AV15TipDefDsc = A834TipDefDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl4 == 0 )
      {
         if ( A833TipDefCod > 0 )
         {
            AV15TipDefDsc = httpContext.getMessage( "Error", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdescdef.this.A396EmprCod;
      this.aP1[0] = pdescdef.this.A833TipDefCod;
      this.aP2[0] = pdescdef.this.AV15TipDefDsc;
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
      P03I22_A396EmprCod = new String[] {""} ;
      P03I22_A833TipDefCod = new short[1] ;
      P03I22_A834TipDefDsc = new String[] {""} ;
      P03I22_n834TipDefDsc = new boolean[] {false} ;
      A834TipDefDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdescdef__default(),
         new Object[] {
             new Object[] {
            P03I22_A396EmprCod, P03I22_A833TipDefCod, P03I22_A834TipDefDsc, P03I22_n834TipDefDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18GXLvl4 ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV15TipDefDsc ;
   private String scmdbuf ;
   private String A834TipDefDsc ;
   private boolean n834TipDefDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03I22_A396EmprCod ;
   private short[] P03I22_A833TipDefCod ;
   private String[] P03I22_A834TipDefDsc ;
   private boolean[] P03I22_n834TipDefDsc ;
}

final  class pdescdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03I22", "SELECT EmprCod, TipDefCod, TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? and TipDefCod = ? ORDER BY EmprCod, TipDefCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

