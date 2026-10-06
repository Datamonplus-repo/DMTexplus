package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc55 extends GXProcedure
{
   public pprc55( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc55.class ), "" );
   }

   public pprc55( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pprc55.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      pprc55.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc55.this.AV9BarDibInt = aP1[0];
      this.aP1 = aP1;
      pprc55.this.AV8nrep = aP2[0];
      this.aP2 = aP2;
      pprc55.this.AV10Msg_dibujo = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Msg_dibujo = "" ;
      AV8nrep = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P05FB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarDibInt)});
      cV8nrep = P05FB2_AV8nrep[0] ;
      pr_default.close(0);
      AV8nrep = (short)(AV8nrep+cV8nrep*1) ;
      /* End optimized group. */
      AV8nrep = (short)(AV8nrep+(((AV8nrep>0) ? -1 : AV8nrep))) ;
      AV10Msg_dibujo = ((AV8nrep>0) ? httpContext.getMessage( "Atencion, el dibujo ", "")+GXutil.trim( GXutil.str( AV9BarDibInt, 8, 0))+httpContext.getMessage( " fue programado en ", "")+GXutil.trim( GXutil.str( AV8nrep, 4, 0))+httpContext.getMessage( " Hdr(s)", "") : "") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc55.this.A396EmprCod;
      this.aP1[0] = pprc55.this.AV9BarDibInt;
      this.aP2[0] = pprc55.this.AV8nrep;
      this.aP3[0] = pprc55.this.AV10Msg_dibujo;
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
      P05FB2_AV8nrep = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc55__default(),
         new Object[] {
             new Object[] {
            P05FB2_AV8nrep
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8nrep ;
   private short cV8nrep ;
   private short Gx_err ;
   private int AV9BarDibInt ;
   private String A396EmprCod ;
   private String AV10Msg_dibujo ;
   private String scmdbuf ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P05FB2_AV8nrep ;
}

final  class pprc55__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05FB2", "SELECT COUNT(*) FROM TXPBARCAD WHERE EmprCod = ? and BarDibInt = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

