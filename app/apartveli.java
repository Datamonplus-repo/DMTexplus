package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apartveli extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apartveli pgm = new apartveli (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apartveli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apartveli.class ), "" );
   }

   public apartveli( int remoteHandle ,
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
      AV11Emprcod = "001" ;
      /* Using cursor P04A12 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4455ArtAcaFor = P04A12_A4455ArtAcaFor[0] ;
         n4455ArtAcaFor = P04A12_n4455ArtAcaFor[0] ;
         A69ArtDsc = P04A12_A69ArtDsc[0] ;
         n69ArtDsc = P04A12_n69ArtDsc[0] ;
         A829TipArtCod = P04A12_A829TipArtCod[0] ;
         A830TipArtDsc = P04A12_A830TipArtDsc[0] ;
         n830TipArtDsc = P04A12_n830TipArtDsc[0] ;
         A65ArtCod = P04A12_A65ArtCod[0] ;
         A252CliCod = P04A12_A252CliCod[0] ;
         A396EmprCod = P04A12_A396EmprCod[0] ;
         A830TipArtDsc = P04A12_A830TipArtDsc[0] ;
         n830TipArtDsc = P04A12_n830TipArtDsc[0] ;
         if ( ( A829TipArtCod > 0 ) && ( GXutil.strcmp(A69ArtDsc, " ") != 0 ) && ( A4455ArtAcaFor == 0 ) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = httpContext.getMessage( "ARTVEL", "") ;
            GXv_char3[0] = A69ArtDsc ;
            GXv_int4[0] = A829TipArtCod ;
            GXv_char5[0] = A830TipArtDsc ;
            GXv_int6[0] = AV12ArtAcaFor ;
            new app.partvel(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_int4, GXv_char5, GXv_int6) ;
            apartveli.this.A396EmprCod = GXv_char1[0] ;
            apartveli.this.A69ArtDsc = GXv_char3[0] ;
            apartveli.this.A829TipArtCod = GXv_int4[0] ;
            apartveli.this.A830TipArtDsc = GXv_char5[0] ;
            apartveli.this.AV12ArtAcaFor = GXv_int6[0] ;
            A4455ArtAcaFor = AV12ArtAcaFor ;
            n4455ArtAcaFor = false ;
            Gx_msg = httpContext.getMessage( "Articulo= ", "") + GXutil.str( AV12ArtAcaFor, 8, 0) ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P04A13 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4455ArtAcaFor), Integer.valueOf(A4455ArtAcaFor), A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(partveli.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apartveli");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Emprcod = "" ;
      scmdbuf = "" ;
      P04A12_A4455ArtAcaFor = new int[1] ;
      P04A12_n4455ArtAcaFor = new boolean[] {false} ;
      P04A12_A69ArtDsc = new String[] {""} ;
      P04A12_n69ArtDsc = new boolean[] {false} ;
      P04A12_A829TipArtCod = new short[1] ;
      P04A12_A830TipArtDsc = new String[] {""} ;
      P04A12_n830TipArtDsc = new boolean[] {false} ;
      P04A12_A65ArtCod = new String[] {""} ;
      P04A12_A252CliCod = new int[1] ;
      P04A12_A396EmprCod = new String[] {""} ;
      A69ArtDsc = "" ;
      A830TipArtDsc = "" ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apartveli__default(),
         new Object[] {
             new Object[] {
            P04A12_A4455ArtAcaFor, P04A12_n4455ArtAcaFor, P04A12_A69ArtDsc, P04A12_n69ArtDsc, P04A12_A829TipArtCod, P04A12_A830TipArtDsc, P04A12_n830TipArtDsc, P04A12_A65ArtCod, P04A12_A252CliCod, P04A12_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A829TipArtCod ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int A4455ArtAcaFor ;
   private int A252CliCod ;
   private int AV12ArtAcaFor ;
   private int GXv_int6[] ;
   private String AV11Emprcod ;
   private String scmdbuf ;
   private String A69ArtDsc ;
   private String A830TipArtDsc ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String Gx_msg ;
   private boolean n4455ArtAcaFor ;
   private boolean n69ArtDsc ;
   private boolean n830TipArtDsc ;
   private IDataStoreProvider pr_default ;
   private int[] P04A12_A4455ArtAcaFor ;
   private boolean[] P04A12_n4455ArtAcaFor ;
   private String[] P04A12_A69ArtDsc ;
   private boolean[] P04A12_n69ArtDsc ;
   private short[] P04A12_A829TipArtCod ;
   private String[] P04A12_A830TipArtDsc ;
   private boolean[] P04A12_n830TipArtDsc ;
   private String[] P04A12_A65ArtCod ;
   private int[] P04A12_A252CliCod ;
   private String[] P04A12_A396EmprCod ;
}

final  class apartveli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04A12", "SELECT T1.ArtAcaFor, T1.ArtDsc, T1.TipArtCod, T2.TipArtDsc, T1.ArtCod, T1.CliCod, T1.EmprCod FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04A13", "UPDATE TXPARTICU SET ArtAcaFor=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
      }
   }

}

