package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptipartdsc extends GXProcedure
{
   public ptipartdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptipartdsc.class ), "" );
   }

   public ptipartdsc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 )
   {
      ptipartdsc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             String[] aP2 )
   {
      ptipartdsc.this.A396EmprCod = aP0;
      ptipartdsc.this.A829TipArtCod = aP1;
      ptipartdsc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TipArtDsc = " " ;
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P021A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A830TipArtDsc = P021A2_A830TipArtDsc[0] ;
         n830TipArtDsc = P021A2_n830TipArtDsc[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8TipArtDsc = ((0==A829TipArtCod) ? "" : "Error") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ptipartdsc.this.AV8TipArtDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8TipArtDsc = "" ;
      scmdbuf = "" ;
      P021A2_A396EmprCod = new String[] {""} ;
      P021A2_A829TipArtCod = new short[1] ;
      P021A2_A830TipArtDsc = new String[] {""} ;
      P021A2_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptipartdsc__default(),
         new Object[] {
             new Object[] {
            P021A2_A396EmprCod, P021A2_A829TipArtCod, P021A2_A830TipArtDsc, P021A2_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8TipArtDsc ;
   private String scmdbuf ;
   private String A830TipArtDsc ;
   private boolean n830TipArtDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P021A2_A396EmprCod ;
   private short[] P021A2_A829TipArtCod ;
   private String[] P021A2_A830TipArtDsc ;
   private boolean[] P021A2_n830TipArtDsc ;
}

final  class ptipartdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021A2", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

