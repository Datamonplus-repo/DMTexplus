package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexipasta extends GXProcedure
{
   public pexipasta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexipasta.class ), "" );
   }

   public pexipasta( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pexipasta.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pexipasta.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexipasta.this.A2107PasCod = aP1[0];
      this.aP1 = aP1;
      pexipasta.this.AV8PasDsc = aP2[0];
      this.aP2 = aP2;
      pexipasta.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV8PasDsc = " " ;
      AV12GXLvl3 = (byte)(0) ;
      /* Using cursor P05U52 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2107PasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2108PasDsc = P05U52_A2108PasDsc[0] ;
         n2108PasDsc = P05U52_n2108PasDsc[0] ;
         AV12GXLvl3 = (byte)(1) ;
         AV8PasDsc = A2108PasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl3 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Error. Codigo Inexistente", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexipasta.this.A396EmprCod;
      this.aP1[0] = pexipasta.this.A2107PasCod;
      this.aP2[0] = pexipasta.this.AV8PasDsc;
      this.aP3[0] = pexipasta.this.Gx_msg;
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
      P05U52_A396EmprCod = new String[] {""} ;
      P05U52_A2107PasCod = new String[] {""} ;
      P05U52_A2108PasDsc = new String[] {""} ;
      P05U52_n2108PasDsc = new boolean[] {false} ;
      A2108PasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexipasta__default(),
         new Object[] {
             new Object[] {
            P05U52_A396EmprCod, P05U52_A2107PasCod, P05U52_A2108PasDsc, P05U52_n2108PasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A2107PasCod ;
   private String AV8PasDsc ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A2108PasDsc ;
   private boolean n2108PasDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05U52_A396EmprCod ;
   private String[] P05U52_A2107PasCod ;
   private String[] P05U52_A2108PasDsc ;
   private boolean[] P05U52_n2108PasDsc ;
}

final  class pexipasta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05U52", "SELECT EmprCod, PasCod, PasDsc FROM TXPCPASTA WHERE EmprCod = ? and PasCod = ? ORDER BY EmprCod, PasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

