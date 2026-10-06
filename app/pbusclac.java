package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusclac extends GXProcedure
{
   public pbusclac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusclac.class ), "" );
   }

   public pbusclac( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             byte aP4 )
   {
      pbusclac.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             String[] aP5 )
   {
      pbusclac.this.A396EmprCod = aP0;
      pbusclac.this.A1013DibCli = aP1;
      pbusclac.this.A252CliCod = aP2;
      pbusclac.this.A1014DibInt = aP3;
      pbusclac.this.A2089DibLinMol = aP4;
      pbusclac.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DibActivo = httpContext.getMessage( "S", "") ;
      /* Using cursor P03822 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Boolean.valueOf(n2089DibLinMol), Byte.valueOf(A2089DibLinMol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8415DibActivo = P03822_A8415DibActivo[0] ;
         n8415DibActivo = P03822_n8415DibActivo[0] ;
         A1807DibLinCil = P03822_A1807DibLinCil[0] ;
         AV8DibActivo = A8415DibActivo ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pbusclac.this.AV8DibActivo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8DibActivo = "" ;
      scmdbuf = "" ;
      P03822_A396EmprCod = new String[] {""} ;
      P03822_A1013DibCli = new String[] {""} ;
      P03822_A252CliCod = new int[1] ;
      P03822_A1014DibInt = new int[1] ;
      P03822_A2089DibLinMol = new byte[1] ;
      P03822_n2089DibLinMol = new boolean[] {false} ;
      P03822_A8415DibActivo = new String[] {""} ;
      P03822_n8415DibActivo = new boolean[] {false} ;
      P03822_A1807DibLinCil = new short[1] ;
      A8415DibActivo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusclac__default(),
         new Object[] {
             new Object[] {
            P03822_A396EmprCod, P03822_A1013DibCli, P03822_A252CliCod, P03822_A1014DibInt, P03822_A2089DibLinMol, P03822_n2089DibLinMol, P03822_A8415DibActivo, P03822_n8415DibActivo, P03822_A1807DibLinCil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2089DibLinMol ;
   private short A1807DibLinCil ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String AV8DibActivo ;
   private String scmdbuf ;
   private String A8415DibActivo ;
   private boolean n2089DibLinMol ;
   private boolean n8415DibActivo ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03822_A396EmprCod ;
   private String[] P03822_A1013DibCli ;
   private int[] P03822_A252CliCod ;
   private int[] P03822_A1014DibInt ;
   private byte[] P03822_A2089DibLinMol ;
   private boolean[] P03822_n2089DibLinMol ;
   private String[] P03822_A8415DibActivo ;
   private boolean[] P03822_n8415DibActivo ;
   private short[] P03822_A1807DibLinCil ;
}

final  class pbusclac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03822", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinMol, DibActivo, DibLinCil FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and DibLinMol = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinMol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               return;
      }
   }

}

