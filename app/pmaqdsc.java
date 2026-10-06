package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqdsc extends GXProcedure
{
   public pmaqdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqdsc.class ), "" );
   }

   public pmaqdsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pmaqdsc.this.aP2 = new String[] {""};
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
      pmaqdsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmaqdsc.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pmaqdsc.this.AV8MaqDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P015D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A606MaqDsc = P015D2_A606MaqDsc[0] ;
         n606MaqDsc = P015D2_n606MaqDsc[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8MaqDsc = A606MaqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8MaqDsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmaqdsc.this.A396EmprCod;
      this.aP1[0] = pmaqdsc.this.A602MaqCod;
      this.aP2[0] = pmaqdsc.this.AV8MaqDsc;
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
      P015D2_A396EmprCod = new String[] {""} ;
      P015D2_A602MaqCod = new String[] {""} ;
      P015D2_A606MaqDsc = new String[] {""} ;
      P015D2_n606MaqDsc = new boolean[] {false} ;
      A606MaqDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqdsc__default(),
         new Object[] {
             new Object[] {
            P015D2_A396EmprCod, P015D2_A602MaqCod, P015D2_A606MaqDsc, P015D2_n606MaqDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV8MaqDsc ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private boolean n606MaqDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P015D2_A396EmprCod ;
   private String[] P015D2_A602MaqCod ;
   private String[] P015D2_A606MaqDsc ;
   private boolean[] P015D2_n606MaqDsc ;
}

final  class pmaqdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P015D2", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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

