package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class proveedoractual extends GXProcedure
{
   public proveedoractual( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( proveedoractual.class ), "" );
   }

   public proveedoractual( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 )
   {
      proveedoractual.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String[] aP3 )
   {
      proveedoractual.this.AV10Emprcod = aP0;
      proveedoractual.this.AV11PrdNum = aP1;
      proveedoractual.this.AV9PrvNum = aP2;
      proveedoractual.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ProveedorActual = "N" ;
      /* Using cursor P09RU2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV11PrdNum, Integer.valueOf(AV9PrvNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P09RU2_A795PrvNum[0] ;
         A719PrdNum = P09RU2_A719PrdNum[0] ;
         A396EmprCod = P09RU2_A396EmprCod[0] ;
         AV8ProveedorActual = "S" ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = proveedoractual.this.AV8ProveedorActual;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ProveedorActual = "" ;
      scmdbuf = "" ;
      P09RU2_A795PrvNum = new int[1] ;
      P09RU2_A719PrdNum = new String[] {""} ;
      P09RU2_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.proveedoractual__default(),
         new Object[] {
             new Object[] {
            P09RU2_A795PrvNum, P09RU2_A719PrdNum, P09RU2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9PrvNum ;
   private int A795PrvNum ;
   private String AV10Emprcod ;
   private String AV11PrdNum ;
   private String AV8ProveedorActual ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P09RU2_A795PrvNum ;
   private String[] P09RU2_A719PrdNum ;
   private String[] P09RU2_A396EmprCod ;
}

final  class proveedoractual__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RU2", "SELECT PrvNum, PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (PrvNum = ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

