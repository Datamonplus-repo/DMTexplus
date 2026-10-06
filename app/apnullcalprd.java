package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apnullcalprd extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apnullcalprd pgm = new apnullcalprd (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apnullcalprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apnullcalprd.class ), "" );
   }

   public apnullcalprd( int remoteHandle ,
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
      AV8Emprcod = "001" ;
      /* Using cursor P04D72 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5140AlbMarca = P04D72_A5140AlbMarca[0] ;
         A396EmprCod = P04D72_A396EmprCod[0] ;
         A1243GuiRemCli = P04D72_A1243GuiRemCli[0] ;
         A34AlbProfch = P04D72_A34AlbProfch[0] ;
         A30AlbProCod = P04D72_A30AlbProCod[0] ;
         if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
         {
            if ( A1243GuiRemCli == 0 )
            {
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A30AlbProCod ;
               GXv_int3[0] = AV10Guiremcli ;
               GXv_date4[0] = AV11ALbprofch ;
               new app.pnextcalprd(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_date4) ;
               apnullcalprd.this.A396EmprCod = GXv_char1[0] ;
               apnullcalprd.this.A30AlbProCod = GXv_int2[0] ;
               apnullcalprd.this.AV10Guiremcli = GXv_int3[0] ;
               apnullcalprd.this.AV11ALbprofch = GXv_date4[0] ;
               A1243GuiRemCli = AV10Guiremcli ;
               A34AlbProfch = AV11ALbprofch ;
               Gx_msg = httpContext.getMessage( "Procesando... ", "") + GXutil.str( A30AlbProCod, 10, 0) ;
               System.out.println( Gx_msg );
            }
            /* Using cursor P04D73 */
            pr_default.execute(1, new Object[] {Integer.valueOf(A1243GuiRemCli), A34AlbProfch, A396EmprCod, Long.valueOf(A30AlbProCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pnullcalprd.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apnullcalprd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Emprcod = "" ;
      scmdbuf = "" ;
      P04D72_A5140AlbMarca = new String[] {""} ;
      P04D72_A396EmprCod = new String[] {""} ;
      P04D72_A1243GuiRemCli = new int[1] ;
      P04D72_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P04D72_A30AlbProCod = new long[1] ;
      A5140AlbMarca = "" ;
      A396EmprCod = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      AV11ALbprofch = GXutil.nullDate() ;
      GXv_date4 = new java.util.Date[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apnullcalprd__default(),
         new Object[] {
             new Object[] {
            P04D72_A5140AlbMarca, P04D72_A396EmprCod, P04D72_A1243GuiRemCli, P04D72_A34AlbProfch, P04D72_A30AlbProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int AV10Guiremcli ;
   private int GXv_int3[] ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A5140AlbMarca ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String Gx_msg ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV11ALbprofch ;
   private java.util.Date GXv_date4[] ;
   private IDataStoreProvider pr_default ;
   private String[] P04D72_A5140AlbMarca ;
   private String[] P04D72_A396EmprCod ;
   private int[] P04D72_A1243GuiRemCli ;
   private java.util.Date[] P04D72_A34AlbProfch ;
   private long[] P04D72_A30AlbProCod ;
}

final  class apnullcalprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04D72", "SELECT AlbMarca, EmprCod, GuiRemCli, AlbProfch, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04D73", "UPDATE TXPCALPRD SET GuiRemCli=?, AlbProfch=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

