package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexparfs extends GXProcedure
{
   public pexparfs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexparfs.class ), "" );
   }

   public pexparfs( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pexparfs.this.aP2 = new String[] {""};
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
      pexparfs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexparfs.this.A1664ParFasCod = aP1[0];
      this.aP1 = aP1;
      pexparfs.this.AV8ParfasDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ParfasDsc = " " ;
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P03SJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1665ParFasDsc = P03SJ2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P03SJ2_n1665ParFasDsc[0] ;
         AV11GXLvl3 = (byte)(1) ;
         AV8ParfasDsc = A1665ParFasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         AV8ParfasDsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexparfs.this.A396EmprCod;
      this.aP1[0] = pexparfs.this.A1664ParFasCod;
      this.aP2[0] = pexparfs.this.AV8ParfasDsc;
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
      P03SJ2_A396EmprCod = new String[] {""} ;
      P03SJ2_A1664ParFasCod = new short[1] ;
      P03SJ2_A1665ParFasDsc = new String[] {""} ;
      P03SJ2_n1665ParFasDsc = new boolean[] {false} ;
      A1665ParFasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexparfs__default(),
         new Object[] {
             new Object[] {
            P03SJ2_A396EmprCod, P03SJ2_A1664ParFasCod, P03SJ2_A1665ParFasDsc, P03SJ2_n1665ParFasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl3 ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8ParfasDsc ;
   private String scmdbuf ;
   private String A1665ParFasDsc ;
   private boolean n1665ParFasDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03SJ2_A396EmprCod ;
   private short[] P03SJ2_A1664ParFasCod ;
   private String[] P03SJ2_A1665ParFasDsc ;
   private boolean[] P03SJ2_n1665ParFasDsc ;
}

final  class pexparfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03SJ2", "SELECT EmprCod, ParFasCod, ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? and ParFasCod = ? ORDER BY EmprCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

