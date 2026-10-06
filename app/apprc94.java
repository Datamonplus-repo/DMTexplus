package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc94 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc94 pgm = new apprc94 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc94( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc94.class ), "" );
   }

   public apprc94( int remoteHandle ,
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
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc94.this.AV10EmprCod = GXv_char1[0] ;
      apprc94.this.AV11EmprNom = GXv_char2[0] ;
      apprc94.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P05HR2 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P05HR2_A65ArtCod[0] ;
         A252CliCod = P05HR2_A252CliCod[0] ;
         A396EmprCod = P05HR2_A396EmprCod[0] ;
         A3682ArtAnu = P05HR2_A3682ArtAnu[0] ;
         n3682ArtAnu = P05HR2_n3682ArtAnu[0] ;
         AV12ArtAnu = A3682ArtAnu ;
         /* Using cursor P05HR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A8065Art_GrmA = P05HR3_A8065Art_GrmA[0] ;
            n8065Art_GrmA = P05HR3_n8065Art_GrmA[0] ;
            A12752Art_Tipo = P05HR3_A12752Art_Tipo[0] ;
            n12752Art_Tipo = P05HR3_n12752Art_Tipo[0] ;
            A758ProCod = P05HR3_A758ProCod[0] ;
            AV13Control = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + "->" + GXutil.str( A252CliCod, 6, 0) + " " + A65ArtCod + " " + A758ProCod + " " + AV12ArtAnu ;
            System.out.println( AV13Control );
            A12752Art_Tipo = AV12ArtAnu ;
            n12752Art_Tipo = false ;
            /* Using cursor P05HR4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n12752Art_Tipo), A12752Art_Tipo, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc94.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprc94");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05HR2_A65ArtCod = new String[] {""} ;
      P05HR2_A252CliCod = new int[1] ;
      P05HR2_A396EmprCod = new String[] {""} ;
      P05HR2_A3682ArtAnu = new String[] {""} ;
      P05HR2_n3682ArtAnu = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A3682ArtAnu = "" ;
      AV12ArtAnu = "" ;
      P05HR3_A396EmprCod = new String[] {""} ;
      P05HR3_A252CliCod = new int[1] ;
      P05HR3_A65ArtCod = new String[] {""} ;
      P05HR3_A8065Art_GrmA = new short[1] ;
      P05HR3_n8065Art_GrmA = new boolean[] {false} ;
      P05HR3_A12752Art_Tipo = new String[] {""} ;
      P05HR3_n12752Art_Tipo = new boolean[] {false} ;
      P05HR3_A758ProCod = new String[] {""} ;
      A12752Art_Tipo = "" ;
      A758ProCod = "" ;
      AV13Control = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc94__default(),
         new Object[] {
             new Object[] {
            P05HR2_A65ArtCod, P05HR2_A252CliCod, P05HR2_A396EmprCod, P05HR2_A3682ArtAnu, P05HR2_n3682ArtAnu
            }
            , new Object[] {
            P05HR3_A396EmprCod, P05HR3_A252CliCod, P05HR3_A65ArtCod, P05HR3_A8065Art_GrmA, P05HR3_n8065Art_GrmA, P05HR3_A12752Art_Tipo, P05HR3_n12752Art_Tipo, P05HR3_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8065Art_GrmA ;
   private short Gx_err ;
   private int A252CliCod ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A3682ArtAnu ;
   private String AV12ArtAnu ;
   private String A12752Art_Tipo ;
   private String A758ProCod ;
   private boolean n3682ArtAnu ;
   private boolean n8065Art_GrmA ;
   private boolean n12752Art_Tipo ;
   private String AV13Control ;
   private IDataStoreProvider pr_default ;
   private String[] P05HR2_A65ArtCod ;
   private int[] P05HR2_A252CliCod ;
   private String[] P05HR2_A396EmprCod ;
   private String[] P05HR2_A3682ArtAnu ;
   private boolean[] P05HR2_n3682ArtAnu ;
   private String[] P05HR3_A396EmprCod ;
   private int[] P05HR3_A252CliCod ;
   private String[] P05HR3_A65ArtCod ;
   private short[] P05HR3_A8065Art_GrmA ;
   private boolean[] P05HR3_n8065Art_GrmA ;
   private String[] P05HR3_A12752Art_Tipo ;
   private boolean[] P05HR3_n12752Art_Tipo ;
   private String[] P05HR3_A758ProCod ;
}

final  class apprc94__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05HR2", "SELECT ArtCod, CliCod, EmprCod, ArtAnu FROM TXPARTICU WHERE EmprCod = ? and CliCod > 0 ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05HR3", "SELECT EmprCod, CliCod, ArtCod, Art_GrmA, Art_Tipo, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05HR4", "UPDATE TXPARTLIN SET Art_Tipo=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 8);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 8);
               return;
      }
   }

}

