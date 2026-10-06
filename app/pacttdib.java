package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacttdib extends GXProcedure
{
   public pacttdib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacttdib.class ), "" );
   }

   public pacttdib( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      pacttdib.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      pacttdib.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacttdib.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      pacttdib.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pacttdib.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03862 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8415DibActivo = P03862_A8415DibActivo[0] ;
         n8415DibActivo = P03862_n8415DibActivo[0] ;
         A1807DibLinCil = P03862_A1807DibLinCil[0] ;
         A8415DibActivo = httpContext.getMessage( "S", "") ;
         n8415DibActivo = false ;
         /* Using cursor P03863 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n8415DibActivo), A8415DibActivo, A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A1807DibLinCil)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacttdib.this.A396EmprCod;
      this.aP1[0] = pacttdib.this.A1013DibCli;
      this.aP2[0] = pacttdib.this.A252CliCod;
      this.aP3[0] = pacttdib.this.A1014DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacttdib");
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
      P03862_A396EmprCod = new String[] {""} ;
      P03862_A1013DibCli = new String[] {""} ;
      P03862_A252CliCod = new int[1] ;
      P03862_A1014DibInt = new int[1] ;
      P03862_A8415DibActivo = new String[] {""} ;
      P03862_n8415DibActivo = new boolean[] {false} ;
      P03862_A1807DibLinCil = new short[1] ;
      A8415DibActivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacttdib__default(),
         new Object[] {
             new Object[] {
            P03862_A396EmprCod, P03862_A1013DibCli, P03862_A252CliCod, P03862_A1014DibInt, P03862_A8415DibActivo, P03862_n8415DibActivo, P03862_A1807DibLinCil
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1807DibLinCil ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private String A8415DibActivo ;
   private boolean n8415DibActivo ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03862_A396EmprCod ;
   private String[] P03862_A1013DibCli ;
   private int[] P03862_A252CliCod ;
   private int[] P03862_A1014DibInt ;
   private String[] P03862_A8415DibActivo ;
   private boolean[] P03862_n8415DibActivo ;
   private short[] P03862_A1807DibLinCil ;
}

final  class pacttdib__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03862", "SELECT EmprCod, DibCli, CliCod, DibInt, DibActivo, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03863", "UPDATE TXPLDIBUC SET DibActivo=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND DibLinCil = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

