package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_maquinaprevencion extends GXProcedure
{
   public pget_maquinaprevencion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_maquinaprevencion.class ), "" );
   }

   public pget_maquinaprevencion( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           String aP1 ,
                           String aP2 )
   {
      pget_maquinaprevencion.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             byte[] aP3 )
   {
      pget_maquinaprevencion.this.AV8EmprCod = aP0;
      pget_maquinaprevencion.this.AV9MaqCod = aP1;
      pget_maquinaprevencion.this.AV10PMDsc = aP2;
      pget_maquinaprevencion.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A582 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV9MaqCod, AV10PMDsc});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9473PMDsc = P0A582_A9473PMDsc[0] ;
         n9473PMDsc = P0A582_n9473PMDsc[0] ;
         A9476PMMaqCod = P0A582_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P0A582_n9476PMMaqCod[0] ;
         A396EmprCod = P0A582_A396EmprCod[0] ;
         A9429PMCod = P0A582_A9429PMCod[0] ;
         AV11EnPrevension = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pget_maquinaprevencion.this.AV11EnPrevension;
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
      P0A582_A9473PMDsc = new String[] {""} ;
      P0A582_n9473PMDsc = new boolean[] {false} ;
      P0A582_A9476PMMaqCod = new String[] {""} ;
      P0A582_n9476PMMaqCod = new boolean[] {false} ;
      P0A582_A396EmprCod = new String[] {""} ;
      P0A582_A9429PMCod = new int[1] ;
      A9473PMDsc = "" ;
      A9476PMMaqCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pget_maquinaprevencion__default(),
         new Object[] {
             new Object[] {
            P0A582_A9473PMDsc, P0A582_n9473PMDsc, P0A582_A9476PMMaqCod, P0A582_n9476PMMaqCod, P0A582_A396EmprCod, P0A582_A9429PMCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11EnPrevension ;
   private short Gx_err ;
   private int A9429PMCod ;
   private String AV8EmprCod ;
   private String AV9MaqCod ;
   private String AV10PMDsc ;
   private String scmdbuf ;
   private String A9473PMDsc ;
   private String A9476PMMaqCod ;
   private String A396EmprCod ;
   private boolean n9473PMDsc ;
   private boolean n9476PMMaqCod ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A582_A9473PMDsc ;
   private boolean[] P0A582_n9473PMDsc ;
   private String[] P0A582_A9476PMMaqCod ;
   private boolean[] P0A582_n9476PMMaqCod ;
   private String[] P0A582_A396EmprCod ;
   private int[] P0A582_A9429PMCod ;
}

final  class pget_maquinaprevencion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A582", "SELECT * FROM (SELECT PMDsc, PMMaqCod, EmprCod, PMCod FROM TXPMPREVE WHERE (EmprCod = ? and PMMaqCod = ?) AND (PMDsc = ?) ORDER BY EmprCod, PMMaqCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
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
               stmt.setString(3, (String)parms[2], 30);
               return;
      }
   }

}

