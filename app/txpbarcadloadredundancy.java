package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpbarcadloadredundancy extends GXProcedure
{
   public txpbarcadloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpbarcadloadredundancy.class ), "" );
   }

   public txpbarcadloadredundancy( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPBARCAD ...", "") );
      /* Using cursor TXPBARCADL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = TXPBARCADL2_A361DisCod[0] ;
         A365DisDes = TXPBARCADL2_A365DisDes[0] ;
         A365DisDes = TXPBARCADL2_A365DisDes[0] ;
         A252CliCod = TXPBARCADL2_A252CliCod[0] ;
         n252CliCod = TXPBARCADL2_n252CliCod[0] ;
         A252CliCod = TXPBARCADL2_A252CliCod[0] ;
         n252CliCod = TXPBARCADL2_n252CliCod[0] ;
         A396EmprCod = TXPBARCADL2_A396EmprCod[0] ;
         A180BarMaqCod = TXPBARCADL2_A180BarMaqCod[0] ;
         A2759BarMaqGru = TXPBARCADL2_A2759BarMaqGru[0] ;
         A129BarCod = TXPBARCADL2_A129BarCod[0] ;
         A132BarCodReo = TXPBARCADL2_A132BarCodReo[0] ;
         A130BarCodPar = TXPBARCADL2_A130BarCodPar[0] ;
         O365DisDes = A365DisDes ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         A365DisDes = TXPBARCADL2_A365DisDes[0] ;
         A252CliCod = TXPBARCADL2_A252CliCod[0] ;
         n252CliCod = TXPBARCADL2_n252CliCod[0] ;
         O365DisDes = A365DisDes ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         A365DisDes = O365DisDes ;
         A252CliCod = O252CliCod ;
         n252CliCod = false ;
         O365DisDes = A365DisDes ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         A2759BarMaqGru = GXutil.substring( A180BarMaqCod, 1, 4) ;
         /* Using cursor TXPBARCADL3 */
         pr_default.execute(1, new Object[] {A365DisDes, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A2759BarMaqGru, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpbarcadloadredundancy");
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
      TXPBARCADL2_A361DisCod = new int[1] ;
      TXPBARCADL2_A365DisDes = new String[] {""} ;
      TXPBARCADL2_A252CliCod = new int[1] ;
      TXPBARCADL2_n252CliCod = new boolean[] {false} ;
      TXPBARCADL2_A396EmprCod = new String[] {""} ;
      TXPBARCADL2_A180BarMaqCod = new String[] {""} ;
      TXPBARCADL2_A2759BarMaqGru = new String[] {""} ;
      TXPBARCADL2_A129BarCod = new int[1] ;
      TXPBARCADL2_A132BarCodReo = new byte[1] ;
      TXPBARCADL2_A130BarCodPar = new String[] {""} ;
      A365DisDes = "" ;
      A396EmprCod = "" ;
      A180BarMaqCod = "" ;
      A2759BarMaqGru = "" ;
      A130BarCodPar = "" ;
      O365DisDes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpbarcadloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPBARCADL2_A361DisCod, TXPBARCADL2_A365DisDes, TXPBARCADL2_A365DisDes, TXPBARCADL2_A252CliCod, TXPBARCADL2_n252CliCod, TXPBARCADL2_A252CliCod, TXPBARCADL2_n252CliCod, TXPBARCADL2_A396EmprCod, TXPBARCADL2_A180BarMaqCod, TXPBARCADL2_A2759BarMaqGru,
            TXPBARCADL2_A129BarCod, TXPBARCADL2_A132BarCodReo, TXPBARCADL2_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int O252CliCod ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String A396EmprCod ;
   private String A180BarMaqCod ;
   private String A2759BarMaqGru ;
   private String A130BarCodPar ;
   private String O365DisDes ;
   private boolean n252CliCod ;
   private IDataStoreProvider pr_default ;
   private int[] TXPBARCADL2_A361DisCod ;
   private String[] TXPBARCADL2_A365DisDes ;
   private int[] TXPBARCADL2_A252CliCod ;
   private boolean[] TXPBARCADL2_n252CliCod ;
   private String[] TXPBARCADL2_A396EmprCod ;
   private String[] TXPBARCADL2_A180BarMaqCod ;
   private String[] TXPBARCADL2_A2759BarMaqGru ;
   private int[] TXPBARCADL2_A129BarCod ;
   private byte[] TXPBARCADL2_A132BarCodReo ;
   private String[] TXPBARCADL2_A130BarCodPar ;
}

final  class txpbarcadloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPBARCADL2", "SELECT T1.DisCod, T1.DisDes, T2.DisDes, T1.CliCod, T2.CliCod, T1.EmprCod, T1.BarMaqCod, T1.BarMaqGru, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar  FOR UPDATE OF T1.DisDes, T1.CliCod, T1.BarMaqGru NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPBARCADL3", "UPDATE TXPBARCAD SET DisDes=?, CliCod=?, BarMaqGru=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((String[]) buf[9])[0] = rslt.getString(8, 4);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 1);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 4);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               return;
      }
   }

}

