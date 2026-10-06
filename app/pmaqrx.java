package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqrx extends GXProcedure
{
   public pmaqrx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqrx.class ), "" );
   }

   public pmaqrx( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pmaqrx.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pmaqrx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmaqrx.this.AV2Maqcod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.len( GXutil.trim( AV2Maqcod)) == 1 ) || ( GXutil.len( GXutil.trim( AV2Maqcod)) == 2 ) )
      {
         AV2Maqcod = httpContext.getMessage( "TIAU", "") + GXutil.padl( GXutil.trim( GXutil.str( CommonUtil.decimalVal( AV2Maqcod, "."), 10, 0)), (short)(2), "0") ;
         AV5GXLvl3 = (byte)(0) ;
         /* Using cursor P02102 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV2Maqcod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A602MaqCod = P02102_A602MaqCod[0] ;
            AV5GXLvl3 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV5GXLvl3 == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No Existe Maquina", ""));
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No Existe Maquina", ""));
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmaqrx.this.A396EmprCod;
      this.aP1[0] = pmaqrx.this.AV2Maqcod;
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
      P02102_A396EmprCod = new String[] {""} ;
      P02102_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqrx__default(),
         new Object[] {
             new Object[] {
            P02102_A396EmprCod, P02102_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV5GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV2Maqcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02102_A396EmprCod ;
   private String[] P02102_A602MaqCod ;
}

final  class pmaqrx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02102", "SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

