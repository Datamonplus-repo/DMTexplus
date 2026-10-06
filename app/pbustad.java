package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbustad extends GXProcedure
{
   public pbustad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbustad.class ), "" );
   }

   public pbustad( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pbustad.this.aP2 = new String[] {""};
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
      pbustad.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbustad.this.A829TipArtCod = aP1[0];
      this.aP1 = aP1;
      pbustad.this.AV8TipArtDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TipArtDsc = "" ;
      /* Using cursor P00OF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A830TipArtDsc = P00OF2_A830TipArtDsc[0] ;
         n830TipArtDsc = P00OF2_n830TipArtDsc[0] ;
         AV8TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbustad.this.A396EmprCod;
      this.aP1[0] = pbustad.this.A829TipArtCod;
      this.aP2[0] = pbustad.this.AV8TipArtDsc;
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
      P00OF2_A396EmprCod = new String[] {""} ;
      P00OF2_A829TipArtCod = new short[1] ;
      P00OF2_A830TipArtDsc = new String[] {""} ;
      P00OF2_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbustad__default(),
         new Object[] {
             new Object[] {
            P00OF2_A396EmprCod, P00OF2_A829TipArtCod, P00OF2_A830TipArtDsc, P00OF2_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8TipArtDsc ;
   private String scmdbuf ;
   private String A830TipArtDsc ;
   private boolean n830TipArtDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00OF2_A396EmprCod ;
   private short[] P00OF2_A829TipArtCod ;
   private String[] P00OF2_A830TipArtDsc ;
   private boolean[] P00OF2_n830TipArtDsc ;
}

final  class pbustad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00OF2", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

