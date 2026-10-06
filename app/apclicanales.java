package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apclicanales extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apclicanales pgm = new apclicanales (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apclicanales( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apclicanales.class ), "" );
   }

   public apclicanales( int remoteHandle ,
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
      AV13UsurCod = " " ;
      AV14Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV16EmprCod ;
      GXv_char2[0] = AV15EmprNom ;
      GXv_char3[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char1, GXv_char2, GXv_char3) ;
      apclicanales.this.AV16EmprCod = GXv_char1[0] ;
      apclicanales.this.AV15EmprNom = GXv_char2[0] ;
      apclicanales.this.AV13UsurCod = GXv_char3[0] ;
      /* Using cursor P05JR2 */
      pr_default.execute(0, new Object[] {AV16EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P05JR2_A252CliCod[0] ;
         A396EmprCod = P05JR2_A396EmprCod[0] ;
         A279CliNom = P05JR2_A279CliNom[0] ;
         W396EmprCod = A396EmprCod ;
         Gx_msg = httpContext.getMessage( "Creando ClientesvsClientesCanal... ", "") + GXutil.str( A252CliCod, 6, 0) + " " + A279CliNom ;
         System.out.println( Gx_msg );
         /*
            INSERT RECORD ON TABLE TXPCLiCAn

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         A12843CanalID = A252CliCod ;
         /* Using cursor P05JR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A12843CanalID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLiCAn");
         if ( (pr_default.getStatus(1) == 1) )
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
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pclicanales.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apclicanales");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13UsurCod = "" ;
      AV14Station = "" ;
      AV16EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV15EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05JR2_A252CliCod = new int[1] ;
      P05JR2_A396EmprCod = new String[] {""} ;
      P05JR2_A279CliNom = new String[] {""} ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      W396EmprCod = "" ;
      Gx_msg = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apclicanales__default(),
         new Object[] {
             new Object[] {
            P05JR2_A252CliCod, P05JR2_A396EmprCod, P05JR2_A279CliNom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int GX_INS1766 ;
   private int W252CliCod ;
   private int A12843CanalID ;
   private String AV13UsurCod ;
   private String AV14Station ;
   private String AV16EmprCod ;
   private String GXv_char1[] ;
   private String AV15EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String W396EmprCod ;
   private String Gx_msg ;
   private String Gx_emsg ;
   private IDataStoreProvider pr_default ;
   private int[] P05JR2_A252CliCod ;
   private String[] P05JR2_A396EmprCod ;
   private String[] P05JR2_A279CliNom ;
}

final  class apclicanales__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05JR2", "SELECT CliCod, EmprCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05JR3", "INSERT INTO TXPCLiCAn(EmprCod, CliCod, CanalID) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLiCAn")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

