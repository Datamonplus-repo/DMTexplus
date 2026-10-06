package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apattpedcum extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apattpedcum pgm = new apattpedcum (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apattpedcum( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apattpedcum.class ), "" );
   }

   public apattpedcum( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV13Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV16EmprCod ;
      GXv_char2[0] = AV14EmprNom ;
      GXv_char3[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char1, GXv_char2, GXv_char3) ;
      apattpedcum.this.AV16EmprCod = GXv_char1[0] ;
      apattpedcum.this.AV14EmprNom = GXv_char2[0] ;
      apattpedcum.this.AV15UsurCod = GXv_char3[0] ;
      AV17numr = 0 ;
      /* Using cursor P04SP2 */
      pr_default.execute(0, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04SP2_A396EmprCod[0] ;
         A658PedCod = P04SP2_A658PedCod[0] ;
         A667PedSit = P04SP2_A667PedSit[0] ;
         if ( GXutil.strcmp(A667PedSit, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P04SP3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A659PedCum = P04SP3_A659PedCum[0] ;
               A719PrdNum = P04SP3_A719PrdNum[0] ;
               if ( GXutil.strcmp(A659PedCum, httpContext.getMessage( "N", "")) == 0 )
               {
                  A659PedCum = httpContext.getMessage( "S", "") ;
                  AV17numr = (int)(AV17numr+1) ;
                  Gx_msg = GXutil.str( AV17numr, 6, 0) ;
                  System.out.println( Gx_msg );
                  /* Using cursor P04SP4 */
                  pr_default.execute(2, new Object[] {A659PedCum, A396EmprCod, Integer.valueOf(A658PedCod), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pattpedcum.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apattpedcum");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Station = "" ;
      AV16EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV14EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV15UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P04SP2_A396EmprCod = new String[] {""} ;
      P04SP2_A658PedCod = new int[1] ;
      P04SP2_A667PedSit = new String[] {""} ;
      A396EmprCod = "" ;
      A667PedSit = "" ;
      P04SP3_A396EmprCod = new String[] {""} ;
      P04SP3_A658PedCod = new int[1] ;
      P04SP3_A659PedCum = new String[] {""} ;
      P04SP3_A719PrdNum = new String[] {""} ;
      A659PedCum = "" ;
      A719PrdNum = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apattpedcum__default(),
         new Object[] {
             new Object[] {
            P04SP2_A396EmprCod, P04SP2_A658PedCod, P04SP2_A667PedSit
            }
            , new Object[] {
            P04SP3_A396EmprCod, P04SP3_A658PedCod, P04SP3_A659PedCum, P04SP3_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV17numr ;
   private int A658PedCod ;
   private String AV13Station ;
   private String AV16EmprCod ;
   private String GXv_char1[] ;
   private String AV14EmprNom ;
   private String GXv_char2[] ;
   private String AV15UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String A719PrdNum ;
   private String Gx_msg ;
   private IDataStoreProvider pr_default ;
   private String[] P04SP2_A396EmprCod ;
   private int[] P04SP2_A658PedCod ;
   private String[] P04SP2_A667PedSit ;
   private String[] P04SP3_A396EmprCod ;
   private int[] P04SP3_A658PedCod ;
   private String[] P04SP3_A659PedCum ;
   private String[] P04SP3_A719PrdNum ;
}

final  class apattpedcum__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04SP2", "SELECT EmprCod, PedCod, PedSit FROM TXPCPEDID WHERE EmprCod = ? ORDER BY EmprCod, PedSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04SP3", "SELECT EmprCod, PedCod, PedCum, PrdNum FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04SP4", "UPDATE TXPLPEDID SET PedCum=?  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 6);
               return;
      }
   }

}

