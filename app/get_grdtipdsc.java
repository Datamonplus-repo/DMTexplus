package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_grdtipdsc extends GXProcedure
{
   public get_grdtipdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_grdtipdsc.class ), "" );
   }

   public get_grdtipdsc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 )
   {
      get_grdtipdsc.this.aP2 = new String[] {""};
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
      get_grdtipdsc.this.A396EmprCod = aP0;
      get_grdtipdsc.this.A4364GrdTipArt = aP1;
      get_grdtipdsc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8GrdTipDsc = "" ;
      /* Using cursor P0ANH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4368GrdTipDsc = P0ANH2_A4368GrdTipDsc[0] ;
         AV8GrdTipDsc = A4368GrdTipDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = get_grdtipdsc.this.AV8GrdTipDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8GrdTipDsc = "" ;
      scmdbuf = "" ;
      P0ANH2_A396EmprCod = new String[] {""} ;
      P0ANH2_A4364GrdTipArt = new short[1] ;
      P0ANH2_A4368GrdTipDsc = new String[] {""} ;
      A4368GrdTipDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.get_grdtipdsc__default(),
         new Object[] {
             new Object[] {
            P0ANH2_A396EmprCod, P0ANH2_A4364GrdTipArt, P0ANH2_A4368GrdTipDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8GrdTipDsc ;
   private String scmdbuf ;
   private String A4368GrdTipDsc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ANH2_A396EmprCod ;
   private short[] P0ANH2_A4364GrdTipArt ;
   private String[] P0ANH2_A4368GrdTipDsc ;
}

final  class get_grdtipdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ANH2", "SELECT EmprCod, GrdTipArt, GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

