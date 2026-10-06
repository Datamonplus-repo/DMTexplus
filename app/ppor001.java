package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppor001 extends GXProcedure
{
   public ppor001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppor001.class ), "" );
   }

   public ppor001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            int[] aP4 ,
                            String[] aP5 ,
                            String[] aP6 )
   {
      ppor001.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      ppor001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppor001.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      ppor001.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      ppor001.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      ppor001.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      ppor001.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      ppor001.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      ppor001.this.AV8PorVar = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n9608MolPorVar = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03PE2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n9608MolPorVar), Short.valueOf(AV8PorVar), A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppor001.this.A396EmprCod;
      this.aP1[0] = ppor001.this.A252CliCod;
      this.aP2[0] = ppor001.this.A2141SerEst;
      this.aP3[0] = ppor001.this.A1013DibCli;
      this.aP4[0] = ppor001.this.A1014DibInt;
      this.aP5[0] = ppor001.this.A2074ColCom;
      this.aP6[0] = ppor001.this.A2078ColFon;
      this.aP7[0] = ppor001.this.AV8PorVar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppor001__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8PorVar ;
   private short A9608MolPorVar ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private boolean n9608MolPorVar ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
}

final  class ppor001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03PE2", "UPDATE TXPMFORES SET MolPorVar=?  WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMFORES")
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
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 16);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               return;
      }
   }

}

