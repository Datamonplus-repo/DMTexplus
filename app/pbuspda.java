package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuspda extends GXProcedure
{
   public pbuspda( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuspda.class ), "" );
   }

   public pbuspda( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 )
   {
      pbuspda.this.aP2 = new String[] {""};
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
      pbuspda.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuspda.this.A4295ClasCod = aP1[0];
      this.aP1 = aP1;
      pbuspda.this.AV8ClasDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ClasDsc = " " ;
      AV11GXLvl4 = (byte)(0) ;
      /* Using cursor P03622 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4295ClasCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4296ClasDsc = P03622_A4296ClasDsc[0] ;
         n4296ClasDsc = P03622_n4296ClasDsc[0] ;
         AV11GXLvl4 = (byte)(1) ;
         AV8ClasDsc = A4296ClasDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl4 == 0 )
      {
         AV8ClasDsc = httpContext.getMessage( "Error", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuspda.this.A396EmprCod;
      this.aP1[0] = pbuspda.this.A4295ClasCod;
      this.aP2[0] = pbuspda.this.AV8ClasDsc;
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
      P03622_A396EmprCod = new String[] {""} ;
      P03622_A4295ClasCod = new short[1] ;
      P03622_A4296ClasDsc = new String[] {""} ;
      P03622_n4296ClasDsc = new boolean[] {false} ;
      A4296ClasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuspda__default(),
         new Object[] {
             new Object[] {
            P03622_A396EmprCod, P03622_A4295ClasCod, P03622_A4296ClasDsc, P03622_n4296ClasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl4 ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8ClasDsc ;
   private String scmdbuf ;
   private String A4296ClasDsc ;
   private boolean n4296ClasDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03622_A396EmprCod ;
   private short[] P03622_A4295ClasCod ;
   private String[] P03622_A4296ClasDsc ;
   private boolean[] P03622_n4296ClasDsc ;
}

final  class pbuspda__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03622", "SELECT EmprCod, ClasCod, ClasDsc FROM TXPCLAPEN WHERE EmprCod = ? and ClasCod = ? ORDER BY EmprCod, ClasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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

