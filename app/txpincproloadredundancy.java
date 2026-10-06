package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpincproloadredundancy extends GXProcedure
{
   public txpincproloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpincproloadredundancy.class ), "" );
   }

   public txpincproloadredundancy( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPINCPRO ...", "") );
      /* Using cursor TXPINCPROL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = TXPINCPROL2_A129BarCod[0] ;
         n129BarCod = TXPINCPROL2_n129BarCod[0] ;
         A132BarCodReo = TXPINCPROL2_A132BarCodReo[0] ;
         n132BarCodReo = TXPINCPROL2_n132BarCodReo[0] ;
         A130BarCodPar = TXPINCPROL2_A130BarCodPar[0] ;
         n130BarCodPar = TXPINCPROL2_n130BarCodPar[0] ;
         A212BarSer = TXPINCPROL2_A212BarSer[0] ;
         n212BarSer = TXPINCPROL2_n212BarSer[0] ;
         A252CliCod = TXPINCPROL2_A252CliCod[0] ;
         n252CliCod = TXPINCPROL2_n252CliCod[0] ;
         A652OpeCod = TXPINCPROL2_A652OpeCod[0] ;
         A5294InPTime = TXPINCPROL2_A5294InPTime[0] ;
         A396EmprCod = TXPINCPROL2_A396EmprCod[0] ;
         O212BarSer = A212BarSer ;
         n212BarSer = false ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         O212BarSer = A212BarSer ;
         n212BarSer = false ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         /* Using cursor TXPINCPROL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         A361DisCod = TXPINCPROL3_A361DisCod[0] ;
         A212BarSer = TXPINCPROL3_A212BarSer[0] ;
         n212BarSer = TXPINCPROL3_n212BarSer[0] ;
         O212BarSer = A212BarSer ;
         n212BarSer = false ;
         /* Using cursor TXPINCPROL4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A252CliCod = TXPINCPROL4_A252CliCod[0] ;
         n252CliCod = TXPINCPROL4_n252CliCod[0] ;
         O252CliCod = A252CliCod ;
         n252CliCod = false ;
         A212BarSer = O212BarSer ;
         n212BarSer = false ;
         A252CliCod = O252CliCod ;
         n252CliCod = false ;
         /* Using cursor TXPINCPROL5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n212BarSer), A212BarSer, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A5294InPTime, Integer.valueOf(A652OpeCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINCPRO");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpincproloadredundancy");
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
      TXPINCPROL2_A129BarCod = new int[1] ;
      TXPINCPROL2_n129BarCod = new boolean[] {false} ;
      TXPINCPROL2_A132BarCodReo = new byte[1] ;
      TXPINCPROL2_n132BarCodReo = new boolean[] {false} ;
      TXPINCPROL2_A130BarCodPar = new String[] {""} ;
      TXPINCPROL2_n130BarCodPar = new boolean[] {false} ;
      TXPINCPROL2_A212BarSer = new String[] {""} ;
      TXPINCPROL2_n212BarSer = new boolean[] {false} ;
      TXPINCPROL2_A252CliCod = new int[1] ;
      TXPINCPROL2_n252CliCod = new boolean[] {false} ;
      TXPINCPROL2_A652OpeCod = new int[1] ;
      TXPINCPROL2_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      TXPINCPROL2_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A5294InPTime = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      O212BarSer = "" ;
      TXPINCPROL3_A361DisCod = new int[1] ;
      TXPINCPROL3_A212BarSer = new String[] {""} ;
      TXPINCPROL3_n212BarSer = new boolean[] {false} ;
      TXPINCPROL4_A252CliCod = new int[1] ;
      TXPINCPROL4_n252CliCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpincproloadredundancy__default(),
         new Object[] {
             new Object[] {
            TXPINCPROL2_A129BarCod, TXPINCPROL2_n129BarCod, TXPINCPROL2_A132BarCodReo, TXPINCPROL2_n132BarCodReo, TXPINCPROL2_A130BarCodPar, TXPINCPROL2_n130BarCodPar, TXPINCPROL2_A212BarSer, TXPINCPROL2_n212BarSer, TXPINCPROL2_A252CliCod, TXPINCPROL2_n252CliCod,
            TXPINCPROL2_A652OpeCod, TXPINCPROL2_A5294InPTime, TXPINCPROL2_A396EmprCod
            }
            , new Object[] {
            TXPINCPROL3_A361DisCod, TXPINCPROL3_A212BarSer
            }
            , new Object[] {
            TXPINCPROL4_A252CliCod
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
   private int A129BarCod ;
   private int A252CliCod ;
   private int A652OpeCod ;
   private int O252CliCod ;
   private int A361DisCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A396EmprCod ;
   private String O212BarSer ;
   private java.util.Date A5294InPTime ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n212BarSer ;
   private boolean n252CliCod ;
   private IDataStoreProvider pr_default ;
   private int[] TXPINCPROL2_A129BarCod ;
   private boolean[] TXPINCPROL2_n129BarCod ;
   private byte[] TXPINCPROL2_A132BarCodReo ;
   private boolean[] TXPINCPROL2_n132BarCodReo ;
   private String[] TXPINCPROL2_A130BarCodPar ;
   private boolean[] TXPINCPROL2_n130BarCodPar ;
   private String[] TXPINCPROL2_A212BarSer ;
   private boolean[] TXPINCPROL2_n212BarSer ;
   private int[] TXPINCPROL2_A252CliCod ;
   private boolean[] TXPINCPROL2_n252CliCod ;
   private int[] TXPINCPROL2_A652OpeCod ;
   private java.util.Date[] TXPINCPROL2_A5294InPTime ;
   private String[] TXPINCPROL2_A396EmprCod ;
   private int[] TXPINCPROL3_A361DisCod ;
   private String[] TXPINCPROL3_A212BarSer ;
   private boolean[] TXPINCPROL3_n212BarSer ;
   private int[] TXPINCPROL4_A252CliCod ;
   private boolean[] TXPINCPROL4_n252CliCod ;
}

final  class txpincproloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPINCPROL2", "SELECT BarCod, BarCodReo, BarCodPar, BarSer, CliCod, OpeCod, InPTime, EmprCod FROM TXPINCPRO ORDER BY EmprCod, InPTime, OpeCod  FOR UPDATE OF BarSer, CliCod NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("TXPINCPROL3", "SELECT DisCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("TXPINCPROL4", "SELECT CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPINCPROL5", "UPDATE TXPINCPRO SET BarSer=?, CliCod=?  WHERE EmprCod = ? AND InPTime = ? AND OpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPINCPRO")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setDateTime(4, (java.util.Date)parms[5], false);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
      }
   }

}

