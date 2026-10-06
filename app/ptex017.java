package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptex017 extends GXProcedure
{
   public ptex017( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptex017.class ), "" );
   }

   public ptex017( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          short[] aP2 ,
                          int[] aP3 )
   {
      ptex017.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 )
   {
      ptex017.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptex017.this.A6850Tex_NPed = aP1[0];
      this.aP1 = aP1;
      ptex017.this.A6857Tex_Lin = aP2[0];
      this.aP2 = aP2;
      ptex017.this.AV9Tex_Unidad = aP3[0];
      this.aP3 = aP3;
      ptex017.this.AV8Tex_SmUnd = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n6991Tex_Unidad = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02Y82 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n6991Tex_Unidad), Integer.valueOf(AV8Tex_SmUnd), A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX001");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptex017.this.A396EmprCod;
      this.aP1[0] = ptex017.this.A6850Tex_NPed;
      this.aP2[0] = ptex017.this.A6857Tex_Lin;
      this.aP3[0] = ptex017.this.AV9Tex_Unidad;
      this.aP4[0] = ptex017.this.AV8Tex_SmUnd;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptex017");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptex017__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A6857Tex_Lin ;
   private short Gx_err ;
   private int A6850Tex_NPed ;
   private int AV9Tex_Unidad ;
   private int AV8Tex_SmUnd ;
   private int A6991Tex_Unidad ;
   private String A396EmprCod ;
   private boolean n6991Tex_Unidad ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class ptex017__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02Y82", "UPDATE TXPTEX001 SET Tex_Unidad=?  WHERE EmprCod = ? and Tex_NPed = ? and Tex_Lin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX001")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

