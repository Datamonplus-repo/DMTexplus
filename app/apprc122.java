package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc122 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc122 pgm = new apprc122 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc122( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc122.class ), "" );
   }

   public apprc122( int remoteHandle ,
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
      AV11UsurCod = " " ;
      AV12Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV14EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char3[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc122.this.AV14EmprCod = GXv_char1[0] ;
      apprc122.this.AV13EmprNom = GXv_char2[0] ;
      apprc122.this.AV11UsurCod = GXv_char3[0] ;
      /* Using cursor P05LJ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9713Tb1_Cod = P05LJ2_A9713Tb1_Cod[0] ;
         A396EmprCod = P05LJ2_A396EmprCod[0] ;
         AV10tb1_cod = A9713Tb1_Cod ;
         /* Execute user subroutine: 'TABLE4' */
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
      cleanup();
   }

   public void S111( )
   {
      /* 'TABLE4' Routine */
      returnInSub = false ;
      /* Using cursor P05LJ3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P05LJ3_A252CliCod[0] ;
         A396EmprCod = P05LJ3_A396EmprCod[0] ;
         Gx_msg = httpContext.getMessage( "Creando... Caderno ", "") + GXutil.str( AV10tb1_cod, 4, 0) + httpContext.getMessage( " en Cliente ", "") + GXutil.str( A252CliCod, 6, 0) ;
         System.out.println( Gx_msg );
         /*
            INSERT RECORD ON TABLE TXPTABLA4

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         A9713Tb1_Cod = AV10tb1_cod ;
         /* Using cursor P05LJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A9713Tb1_Cod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTABLA4");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc122.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprc122");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11UsurCod = "" ;
      AV12Station = "" ;
      AV14EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05LJ2_A9713Tb1_Cod = new short[1] ;
      P05LJ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      P05LJ3_A252CliCod = new int[1] ;
      P05LJ3_A396EmprCod = new String[] {""} ;
      Gx_msg = "" ;
      W396EmprCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc122__default(),
         new Object[] {
             new Object[] {
            P05LJ2_A9713Tb1_Cod, P05LJ2_A396EmprCod
            }
            , new Object[] {
            P05LJ3_A252CliCod, P05LJ3_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A9713Tb1_Cod ;
   private short AV10tb1_cod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int GX_INS1534 ;
   private int W252CliCod ;
   private String AV11UsurCod ;
   private String AV12Station ;
   private String AV14EmprCod ;
   private String GXv_char1[] ;
   private String AV13EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String W396EmprCod ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private short[] P05LJ2_A9713Tb1_Cod ;
   private String[] P05LJ2_A396EmprCod ;
   private int[] P05LJ3_A252CliCod ;
   private String[] P05LJ3_A396EmprCod ;
}

final  class apprc122__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LJ2", "SELECT Tb1_Cod, EmprCod FROM TXPTABLE1 WHERE Tb1_Cod > 0 ORDER BY EmprCod, Tb1_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05LJ3", "SELECT CliCod, EmprCod FROM TXPCLIENT ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05LJ4", "INSERT INTO TXPTABLA4(EmprCod, CliCod, Tb1_Cod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTABLA4")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

