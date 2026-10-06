package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class descripcionintensidad extends GXProcedure
{
   public descripcionintensidad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( descripcionintensidad.class ), "" );
   }

   public descripcionintensidad( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      descripcionintensidad.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      descripcionintensidad.this.A396EmprCod = aP0;
      descripcionintensidad.this.A583IntCod = aP1;
      descripcionintensidad.this.aP2 = aP2;
      descripcionintensidad.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8IntAct = "N" ;
      AV9IntDsc = "" ;
      AV12GXLvl4 = (byte)(0) ;
      /* Using cursor P0APG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14255IntAct = P0APG2_A14255IntAct[0] ;
         A584IntDsc = P0APG2_A584IntDsc[0] ;
         n584IntDsc = P0APG2_n584IntDsc[0] ;
         AV12GXLvl4 = (byte)(1) ;
         AV8IntAct = A14255IntAct ;
         AV9IntDsc = A584IntDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl4 == 0 )
      {
         AV9IntDsc = "Intensidad Inexistente" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = descripcionintensidad.this.AV9IntDsc;
      this.aP3[0] = descripcionintensidad.this.AV8IntAct;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9IntDsc = "" ;
      AV8IntAct = "" ;
      scmdbuf = "" ;
      P0APG2_A396EmprCod = new String[] {""} ;
      P0APG2_A583IntCod = new byte[1] ;
      P0APG2_A14255IntAct = new String[] {""} ;
      P0APG2_A584IntDsc = new String[] {""} ;
      P0APG2_n584IntDsc = new boolean[] {false} ;
      A14255IntAct = "" ;
      A584IntDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.descripcionintensidad__default(),
         new Object[] {
             new Object[] {
            P0APG2_A396EmprCod, P0APG2_A583IntCod, P0APG2_A14255IntAct, P0APG2_A584IntDsc, P0APG2_n584IntDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte AV12GXLvl4 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9IntDsc ;
   private String AV8IntAct ;
   private String scmdbuf ;
   private String A14255IntAct ;
   private String A584IntDsc ;
   private boolean n584IntDsc ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0APG2_A396EmprCod ;
   private byte[] P0APG2_A583IntCod ;
   private String[] P0APG2_A14255IntAct ;
   private String[] P0APG2_A584IntDsc ;
   private boolean[] P0APG2_n584IntDsc ;
}

final  class descripcionintensidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APG2", "SELECT EmprCod, IntCod, IntAct, IntDsc FROM TXPINTENS WHERE EmprCod = ? and IntCod = ? ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

