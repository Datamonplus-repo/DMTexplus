package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu010 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu010 pgm = new apsuu010 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu010.class ), "" );
   }

   public apsuu010( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Re-construyo Barfecgen f(Disfec)...", "") );
      /* Using cursor P02V02 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A367DisEst = P02V02_A367DisEst[0] ;
         A396EmprCod = P02V02_A396EmprCod[0] ;
         A369DisFec = P02V02_A369DisFec[0] ;
         A361DisCod = P02V02_A361DisCod[0] ;
         AV8DisFec = A369DisFec ;
         AV9Emprcod = A396EmprCod ;
         AV10Discod = A361DisCod ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Re-construyo Barfecgen f(Disfec)...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02V03 */
      pr_default.execute(1, new Object[] {AV8DisFec, AV9Emprcod, Integer.valueOf(AV10Discod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu010.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu010");
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
      P02V02_A367DisEst = new byte[1] ;
      P02V02_A396EmprCod = new String[] {""} ;
      P02V02_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02V02_A361DisCod = new int[1] ;
      A396EmprCod = "" ;
      A369DisFec = GXutil.nullDate() ;
      AV8DisFec = GXutil.nullDate() ;
      AV9Emprcod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu010__default(),
         new Object[] {
             new Object[] {
            P02V02_A367DisEst, P02V02_A396EmprCod, P02V02_A369DisFec, P02V02_A361DisCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV10Discod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV9Emprcod ;
   private java.util.Date A369DisFec ;
   private java.util.Date AV8DisFec ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private byte[] P02V02_A367DisEst ;
   private String[] P02V02_A396EmprCod ;
   private java.util.Date[] P02V02_A369DisFec ;
   private int[] P02V02_A361DisCod ;
}

final  class apsuu010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02V02", "SELECT DisEst, EmprCod, DisFec, DisCod FROM TXPDISPOS WHERE EmprCod = '001' and DisEst = 3 ORDER BY EmprCod, DisEst ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02V03", "UPDATE TXPBARCAD SET BarFecGen=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

