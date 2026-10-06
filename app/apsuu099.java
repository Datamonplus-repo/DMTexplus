package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu099 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu099 pgm = new apsuu099 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu099( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu099.class ), "" );
   }

   public apsuu099( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Inicio Proceso....", "") );
      /* Using cursor P030O2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7099AlbOComp = P030O2_A7099AlbOComp[0] ;
         A33AlbProEst = P030O2_A33AlbProEst[0] ;
         A396EmprCod = P030O2_A396EmprCod[0] ;
         A30AlbProCod = P030O2_A30AlbProCod[0] ;
         if ( GXutil.strcmp(A7099AlbOComp, httpContext.getMessage( "DESPACHO ANULADO", "")) != 0 )
         {
            AV9Emprcod = A396EmprCod ;
            AV8Albprocod = A30AlbProCod ;
            /* Execute user subroutine: 'LFAVEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV10Lfaven == 0 )
            {
               A7099AlbOComp = httpContext.getMessage( "DESPACHO ANULADO", "") ;
            }
            /* Using cursor P030O3 */
            pr_default.execute(1, new Object[] {A7099AlbOComp, A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Proceso....", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'LFAVEN' Routine */
      returnInSub = false ;
      AV10Lfaven = (byte)(0) ;
      /* Using cursor P030O4 */
      pr_default.execute(2, new Object[] {AV9Emprcod, Long.valueOf(AV8Albprocod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A427FacAlbCod = P030O4_A427FacAlbCod[0] ;
         A396EmprCod = P030O4_A396EmprCod[0] ;
         A430FacCod = P030O4_A430FacCod[0] ;
         A446FacLin = P030O4_A446FacLin[0] ;
         AV10Lfaven = (byte)(1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu099.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu099");
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
      P030O2_A7099AlbOComp = new String[] {""} ;
      P030O2_A33AlbProEst = new byte[1] ;
      P030O2_A396EmprCod = new String[] {""} ;
      P030O2_A30AlbProCod = new long[1] ;
      A7099AlbOComp = "" ;
      A396EmprCod = "" ;
      AV9Emprcod = "" ;
      P030O4_A427FacAlbCod = new long[1] ;
      P030O4_A396EmprCod = new String[] {""} ;
      P030O4_A430FacCod = new int[1] ;
      P030O4_A446FacLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu099__default(),
         new Object[] {
             new Object[] {
            P030O2_A7099AlbOComp, P030O2_A33AlbProEst, P030O2_A396EmprCod, P030O2_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P030O4_A427FacAlbCod, P030O4_A396EmprCod, P030O4_A430FacCod, P030O4_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A33AlbProEst ;
   private byte AV10Lfaven ;
   private short Gx_err ;
   private int A430FacCod ;
   private int A446FacLin ;
   private long A30AlbProCod ;
   private long AV8Albprocod ;
   private long A427FacAlbCod ;
   private String scmdbuf ;
   private String A7099AlbOComp ;
   private String A396EmprCod ;
   private String AV9Emprcod ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P030O2_A7099AlbOComp ;
   private byte[] P030O2_A33AlbProEst ;
   private String[] P030O2_A396EmprCod ;
   private long[] P030O2_A30AlbProCod ;
   private long[] P030O4_A427FacAlbCod ;
   private String[] P030O4_A396EmprCod ;
   private int[] P030O4_A430FacCod ;
   private int[] P030O4_A446FacLin ;
}

final  class apsuu099__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P030O2", "SELECT AlbOComp, AlbProEst, EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = '001' and AlbProEst = 2 ORDER BY EmprCod, AlbProEst ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P030O3", "UPDATE TXPCALPRD SET AlbOComp=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P030O4", "SELECT FacAlbCod, EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacAlbCod = ? ORDER BY EmprCod, FacAlbCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

