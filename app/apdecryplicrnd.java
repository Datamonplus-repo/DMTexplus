package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apdecryplicrnd extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apdecryplicrnd pgm = new apdecryplicrnd (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apdecryplicrnd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apdecryplicrnd.class ), "" );
   }

   public apdecryplicrnd( int remoteHandle ,
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
      /* Using cursor P05JB2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8716RlrFchA = P05JB2_A8716RlrFchA[0] ;
         n8716RlrFchA = P05JB2_n8716RlrFchA[0] ;
         A12845Clave1 = P05JB2_A12845Clave1[0] ;
         n12845Clave1 = P05JB2_n12845Clave1[0] ;
         A12847RlrFchA1 = P05JB2_A12847RlrFchA1[0] ;
         n12847RlrFchA1 = P05JB2_n12847RlrFchA1[0] ;
         A8717RlrFchE = P05JB2_A8717RlrFchE[0] ;
         n8717RlrFchE = P05JB2_n8717RlrFchE[0] ;
         A12846Clave2 = P05JB2_A12846Clave2[0] ;
         n12846Clave2 = P05JB2_n12846Clave2[0] ;
         A12848RlrFchE1 = P05JB2_A12848RlrFchE1[0] ;
         n12848RlrFchE1 = P05JB2_n12848RlrFchE1[0] ;
         A8714RlrFch = P05JB2_A8714RlrFch[0] ;
         A8715RlrUsu = P05JB2_A8715RlrUsu[0] ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A8716RlrFchA)) )
         {
            A8716RlrFchA = localUtil.ctod( httpContext.decrypt64( A12847RlrFchA1, A12845Clave1), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n8716RlrFchA = false ;
            A12847RlrFchA1 = " " ;
            n12847RlrFchA1 = false ;
            A12845Clave1 = " " ;
            n12845Clave1 = false ;
            System.out.println( httpContext.getMessage( "Procesando RlrFchA...", "") );
         }
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A8717RlrFchE)) )
         {
            A8717RlrFchE = localUtil.ctod( httpContext.decrypt64( A12848RlrFchE1, A12846Clave2), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n8717RlrFchE = false ;
            A12848RlrFchE1 = " " ;
            n12848RlrFchE1 = false ;
            A12846Clave2 = " " ;
            n12846Clave2 = false ;
            System.out.println( httpContext.getMessage( "Procesando RlrFchE...", "") );
         }
         /* Using cursor P05JB3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n8716RlrFchA), A8716RlrFchA, Boolean.valueOf(n12845Clave1), A12845Clave1, Boolean.valueOf(n12847RlrFchA1), A12847RlrFchA1, Boolean.valueOf(n8717RlrFchE), A8717RlrFchE, Boolean.valueOf(n12846Clave2), A12846Clave2, Boolean.valueOf(n12848RlrFchE1), A12848RlrFchE1, A8714RlrFch, A8715RlrUsu});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRLICRN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pdecryplicrnd.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apdecryplicrnd");
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
      P05JB2_A8716RlrFchA = new java.util.Date[] {GXutil.nullDate()} ;
      P05JB2_n8716RlrFchA = new boolean[] {false} ;
      P05JB2_A12845Clave1 = new String[] {""} ;
      P05JB2_n12845Clave1 = new boolean[] {false} ;
      P05JB2_A12847RlrFchA1 = new String[] {""} ;
      P05JB2_n12847RlrFchA1 = new boolean[] {false} ;
      P05JB2_A8717RlrFchE = new java.util.Date[] {GXutil.nullDate()} ;
      P05JB2_n8717RlrFchE = new boolean[] {false} ;
      P05JB2_A12846Clave2 = new String[] {""} ;
      P05JB2_n12846Clave2 = new boolean[] {false} ;
      P05JB2_A12848RlrFchE1 = new String[] {""} ;
      P05JB2_n12848RlrFchE1 = new boolean[] {false} ;
      P05JB2_A8714RlrFch = new java.util.Date[] {GXutil.nullDate()} ;
      P05JB2_A8715RlrUsu = new String[] {""} ;
      A8716RlrFchA = GXutil.nullDate() ;
      A12845Clave1 = "" ;
      A12847RlrFchA1 = "" ;
      A8717RlrFchE = GXutil.nullDate() ;
      A12846Clave2 = "" ;
      A12848RlrFchE1 = "" ;
      A8714RlrFch = GXutil.resetTime( GXutil.nullDate() );
      A8715RlrUsu = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apdecryplicrnd__default(),
         new Object[] {
             new Object[] {
            P05JB2_A8716RlrFchA, P05JB2_n8716RlrFchA, P05JB2_A12845Clave1, P05JB2_n12845Clave1, P05JB2_A12847RlrFchA1, P05JB2_n12847RlrFchA1, P05JB2_A8717RlrFchE, P05JB2_n8717RlrFchE, P05JB2_A12846Clave2, P05JB2_n12846Clave2,
            P05JB2_A12848RlrFchE1, P05JB2_n12848RlrFchE1, P05JB2_A8714RlrFch, P05JB2_A8715RlrUsu
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String scmdbuf ;
   private String A12845Clave1 ;
   private String A12847RlrFchA1 ;
   private String A12846Clave2 ;
   private String A12848RlrFchE1 ;
   private String A8715RlrUsu ;
   private java.util.Date A8714RlrFch ;
   private java.util.Date A8716RlrFchA ;
   private java.util.Date A8717RlrFchE ;
   private boolean n8716RlrFchA ;
   private boolean n12845Clave1 ;
   private boolean n12847RlrFchA1 ;
   private boolean n8717RlrFchE ;
   private boolean n12846Clave2 ;
   private boolean n12848RlrFchE1 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P05JB2_A8716RlrFchA ;
   private boolean[] P05JB2_n8716RlrFchA ;
   private String[] P05JB2_A12845Clave1 ;
   private boolean[] P05JB2_n12845Clave1 ;
   private String[] P05JB2_A12847RlrFchA1 ;
   private boolean[] P05JB2_n12847RlrFchA1 ;
   private java.util.Date[] P05JB2_A8717RlrFchE ;
   private boolean[] P05JB2_n8717RlrFchE ;
   private String[] P05JB2_A12846Clave2 ;
   private boolean[] P05JB2_n12846Clave2 ;
   private String[] P05JB2_A12848RlrFchE1 ;
   private boolean[] P05JB2_n12848RlrFchE1 ;
   private java.util.Date[] P05JB2_A8714RlrFch ;
   private String[] P05JB2_A8715RlrUsu ;
}

final  class apdecryplicrnd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05JB2", "SELECT RlrFchA, Clave1, RlrFchA1, RlrFchE, Clave2, RlrFchE1, RlrFch, RlrUsu FROM TXPRLICRN ORDER BY RlrFch  FOR UPDATE OF RlrFchA, Clave1, RlrFchA1, RlrFchE, Clave2, RlrFchE1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05JB3", "UPDATE TXPRLICRN SET RlrFchA=?, Clave1=?, RlrFchA1=?, RlrFchE=?, Clave2=?, RlrFchE1=?  WHERE RlrFch = ? AND RlrUsu = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRLICRN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 32);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 32);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 32);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 32);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[13])[0] = rslt.getString(8, 8);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 32);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 32);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 32);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 32);
               }
               stmt.setDateTime(7, (java.util.Date)parms[12], false);
               stmt.setString(8, (String)parms[13], 8);
               return;
      }
   }

}

