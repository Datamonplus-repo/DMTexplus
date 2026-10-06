package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psiauxlprfor extends GXProcedure
{
   public psiauxlprfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psiauxlprfor.class ), "" );
   }

   public psiauxlprfor( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           byte[] aP3 )
   {
      psiauxlprfor.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      psiauxlprfor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psiauxlprfor.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      psiauxlprfor.this.A5555Lb_opcion = aP2[0];
      this.aP2 = aP2;
      psiauxlprfor.this.AV8Lprfor = aP3[0];
      this.aP3 = aP3;
      psiauxlprfor.this.AV9Nifra = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lprfor = (byte)(0) ;
      /* Using cursor P06082 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6545Lb_PTinP = P06082_A6545Lb_PTinP[0] ;
         A5560Lb_LineaPr = P06082_A5560Lb_LineaPr[0] ;
         if ( AV9Nifra == A6545Lb_PTinP )
         {
            AV8Lprfor = (byte)(1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psiauxlprfor.this.A396EmprCod;
      this.aP1[0] = psiauxlprfor.this.A5532Lb_numero;
      this.aP2[0] = psiauxlprfor.this.A5555Lb_opcion;
      this.aP3[0] = psiauxlprfor.this.AV8Lprfor;
      this.aP4[0] = psiauxlprfor.this.AV9Nifra;
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
      P06082_A396EmprCod = new String[] {""} ;
      P06082_A5532Lb_numero = new int[1] ;
      P06082_A5555Lb_opcion = new String[] {""} ;
      P06082_A6545Lb_PTinP = new byte[1] ;
      P06082_A5560Lb_LineaPr = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psiauxlprfor__default(),
         new Object[] {
             new Object[] {
            P06082_A396EmprCod, P06082_A5532Lb_numero, P06082_A5555Lb_opcion, P06082_A6545Lb_PTinP, P06082_A5560Lb_LineaPr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Lprfor ;
   private byte AV9Nifra ;
   private byte A6545Lb_PTinP ;
   private short A5560Lb_LineaPr ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String scmdbuf ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P06082_A396EmprCod ;
   private int[] P06082_A5532Lb_numero ;
   private String[] P06082_A5555Lb_opcion ;
   private byte[] P06082_A6545Lb_PTinP ;
   private short[] P06082_A5560Lb_LineaPr ;
}

final  class psiauxlprfor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06082", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_PTinP, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

