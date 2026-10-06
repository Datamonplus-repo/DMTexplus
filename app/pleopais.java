package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pleopais extends GXProcedure
{
   public pleopais( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pleopais.class ), "" );
   }

   public pleopais( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 )
   {
      pleopais.this.aP1 = new byte[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 )
   {
      pleopais.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pleopais.this.AV16Colombia = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Colombia = (byte)(0) ;
      /* Using cursor P039X2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P039X2_A313ContCod[0] ;
         A7209Colombia = P039X2_A7209Colombia[0] ;
         n7209Colombia = P039X2_n7209Colombia[0] ;
         A7209Colombia = P039X2_A7209Colombia[0] ;
         n7209Colombia = P039X2_n7209Colombia[0] ;
         AV16Colombia = A7209Colombia ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pleopais.this.A396EmprCod;
      this.aP1[0] = pleopais.this.AV16Colombia;
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
      P039X2_A396EmprCod = new String[] {""} ;
      P039X2_A313ContCod = new String[] {""} ;
      P039X2_A7209Colombia = new byte[1] ;
      P039X2_n7209Colombia = new boolean[] {false} ;
      A313ContCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pleopais__default(),
         new Object[] {
             new Object[] {
            P039X2_A396EmprCod, P039X2_A313ContCod, P039X2_A7209Colombia, P039X2_n7209Colombia
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Colombia ;
   private byte A7209Colombia ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private boolean n7209Colombia ;
   private byte[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P039X2_A396EmprCod ;
   private String[] P039X2_A313ContCod ;
   private byte[] P039X2_A7209Colombia ;
   private boolean[] P039X2_n7209Colombia ;
}

final  class pleopais__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P039X2", "SELECT T1.EmprCod, T1.ContCod, T2.Colombia FROM (TXPEMPLIN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               return;
      }
   }

}

