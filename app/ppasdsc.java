package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppasdsc extends GXProcedure
{
   public ppasdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppasdsc.class ), "" );
   }

   public ppasdsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      ppasdsc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      ppasdsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppasdsc.this.A2107PasCod = aP1[0];
      this.aP1 = aP1;
      ppasdsc.this.AV8PASDSC = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PASDSC = " " ;
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P02Z72 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2107PasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2108PasDsc = P02Z72_A2108PasDsc[0] ;
         n2108PasDsc = P02Z72_n2108PasDsc[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8PASDSC = A2108PasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8PASDSC = ((GXutil.strcmp(A2107PasCod, " ")!=0) ? httpContext.getMessage( "Error", "") : "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppasdsc.this.A396EmprCod;
      this.aP1[0] = ppasdsc.this.A2107PasCod;
      this.aP2[0] = ppasdsc.this.AV8PASDSC;
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
      P02Z72_A396EmprCod = new String[] {""} ;
      P02Z72_A2107PasCod = new String[] {""} ;
      P02Z72_A2108PasDsc = new String[] {""} ;
      P02Z72_n2108PasDsc = new boolean[] {false} ;
      A2108PasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppasdsc__default(),
         new Object[] {
             new Object[] {
            P02Z72_A396EmprCod, P02Z72_A2107PasCod, P02Z72_A2108PasDsc, P02Z72_n2108PasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A2107PasCod ;
   private String AV8PASDSC ;
   private String scmdbuf ;
   private String A2108PasDsc ;
   private boolean n2108PasDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02Z72_A396EmprCod ;
   private String[] P02Z72_A2107PasCod ;
   private String[] P02Z72_A2108PasDsc ;
   private boolean[] P02Z72_n2108PasDsc ;
}

final  class ppasdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02Z72", "SELECT EmprCod, PasCod, PasDsc FROM TXPCPASTA WHERE EmprCod = ? and PasCod = ? ORDER BY EmprCod, PasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

