package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apparper extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apparper pgm = new apparper (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apparper( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apparper.class ), "" );
   }

   public apparper( int remoteHandle ,
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
      /* Using cursor P00F62 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10433ResCod = P00F62_A10433ResCod[0] ;
         A396EmprCod = P00F62_A396EmprCod[0] ;
         A10435ResEst = P00F62_A10435ResEst[0] ;
         n10435ResEst = P00F62_n10435ResEst[0] ;
         /* Using cursor P00F63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10433ResCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A10457ResParCod = P00F63_A10457ResParCod[0] ;
            AV13ResCodChar = GXutil.trim( GXutil.str( A10433ResCod, 10, 0)) ;
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = AV13ResCodChar ;
            GXv_char3[0] = A10457ResParCod ;
            GXv_int4[0] = (byte)(0) ;
            new app.pmodton(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4) ;
            apparper.this.A396EmprCod = GXv_char1[0] ;
            apparper.this.AV13ResCodChar = GXv_char2[0] ;
            apparper.this.A10457ResParCod = GXv_char3[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A10435ResEst = (byte)(2) ;
         n10435ResEst = false ;
         /* Using cursor P00F64 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n10435ResEst), Byte.valueOf(A10435ResEst), A396EmprCod, Integer.valueOf(A10433ResCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPResFil");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pparper.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apparper");
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
      P00F62_A10433ResCod = new int[1] ;
      P00F62_A396EmprCod = new String[] {""} ;
      P00F62_A10435ResEst = new byte[1] ;
      P00F62_n10435ResEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      P00F63_A396EmprCod = new String[] {""} ;
      P00F63_A10433ResCod = new int[1] ;
      P00F63_A10457ResParCod = new String[] {""} ;
      A10457ResParCod = "" ;
      AV13ResCodChar = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apparper__default(),
         new Object[] {
             new Object[] {
            P00F62_A10433ResCod, P00F62_A396EmprCod, P00F62_A10435ResEst, P00F62_n10435ResEst
            }
            , new Object[] {
            P00F63_A396EmprCod, P00F63_A10433ResCod, P00F63_A10457ResParCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10435ResEst ;
   private byte GXv_int4[] ;
   private short Gx_err ;
   private int A10433ResCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10457ResParCod ;
   private String AV13ResCodChar ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private boolean n10435ResEst ;
   private IDataStoreProvider pr_default ;
   private int[] P00F62_A10433ResCod ;
   private String[] P00F62_A396EmprCod ;
   private byte[] P00F62_A10435ResEst ;
   private boolean[] P00F62_n10435ResEst ;
   private String[] P00F63_A396EmprCod ;
   private int[] P00F63_A10433ResCod ;
   private String[] P00F63_A10457ResParCod ;
}

final  class apparper__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00F62", "SELECT ResCod, EmprCod, ResEst FROM TXPResFil WHERE ResEst = 12 ORDER BY EmprCod, ResCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00F63", "SELECT EmprCod, ResCod, ResParCod FROM TXPResPar WHERE (EmprCod = ? and ResCod = ?) AND (ResParCod <> ' ') ORDER BY EmprCod, ResCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00F64", "UPDATE TXPResFil SET ResEst=?  WHERE EmprCod = ? AND ResCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPResFil")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

