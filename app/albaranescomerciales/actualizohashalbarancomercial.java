package app.albaranescomerciales ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizohashalbarancomercial extends GXProcedure
{
   public actualizohashalbarancomercial( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizohashalbarancomercial.class ), "" );
   }

   public actualizohashalbarancomercial( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      actualizohashalbarancomercial.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      actualizohashalbarancomercial.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      actualizohashalbarancomercial.this.A14AlbComCod = aP1[0];
      this.aP1 = aP1;
      actualizohashalbarancomercial.this.AV9Cadena = aP2[0];
      this.aP2 = aP2;
      actualizohashalbarancomercial.this.AV17AlbComFd = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P09Z32 */
      pr_default.execute(0, new Object[] {AV17AlbComFd, AV9Cadena, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = actualizohashalbarancomercial.this.A396EmprCod;
      this.aP1[0] = actualizohashalbarancomercial.this.A14AlbComCod;
      this.aP2[0] = actualizohashalbarancomercial.this.AV9Cadena;
      this.aP3[0] = actualizohashalbarancomercial.this.AV17AlbComFd;
      Application.commitDataStores(context, remoteHandle, pr_default, "albaranescomerciales.actualizohashalbarancomercial");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranescomerciales.actualizohashalbarancomercial__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private String AV9Cadena ;
   private String AV17AlbComFd ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class actualizohashalbarancomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09Z32", "UPDATE TXPCALCOM SET AlbComFd=?, AlbComFdD=?  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               stmt.setString(1, (String)parms[0], 200);
               stmt.setString(2, (String)parms[1], 200);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

