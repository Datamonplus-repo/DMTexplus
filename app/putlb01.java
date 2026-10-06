package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putlb01 extends GXProcedure
{
   public putlb01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putlb01.class ), "" );
   }

   public putlb01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      putlb01.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      putlb01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      putlb01.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      putlb01.this.A5555Lb_opcion = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P02LC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = putlb01.this.A396EmprCod;
      this.aP1[0] = putlb01.this.A5532Lb_numero;
      this.aP2[0] = putlb01.this.A5555Lb_opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "putlb01");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.putlb01__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class putlb01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02LC2", "UPDATE TXPENS002 SET Lb_HoraEn=TO_DATE('0001-01-01', 'YYYY-MM-DD'), Lb_FechaEn=TO_DATE('0001-01-01', 'YYYY-MM-DD'), Lb_Estado=0, Lb_HoraR=TO_DATE('0001-01-01', 'YYYY-MM-DD'), Lb_FechaR=TO_DATE('0001-01-01', 'YYYY-MM-DD')  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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

