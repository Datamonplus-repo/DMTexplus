package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apdatalbrec extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apdatalbrec pgm = new apdatalbrec (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apdatalbrec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apdatalbrec.class ), "" );
   }

   public apdatalbrec( int remoteHandle ,
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
      AV18Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV19EmprCod ;
      GXv_char2[0] = AV20EmprNom ;
      GXv_char3[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char1, GXv_char2, GXv_char3) ;
      apdatalbrec.this.AV19EmprCod = GXv_char1[0] ;
      apdatalbrec.this.AV20EmprNom = GXv_char2[0] ;
      apdatalbrec.this.AV21UsurCod = GXv_char3[0] ;
      /* Using cursor P04GD2 */
      pr_default.execute(0, new Object[] {AV19EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04GD2_A396EmprCod[0] ;
         A45AlbRef = P04GD2_A45AlbRef[0] ;
         A252CliCod = P04GD2_A252CliCod[0] ;
         A4920AlbRGrm2 = P04GD2_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = P04GD2_A4921AlbRAnc[0] ;
         A4922AlbPml = P04GD2_A4922AlbPml[0] ;
         A44AlbRecCod = P04GD2_A44AlbRecCod[0] ;
         AV22Albref = A45AlbRef ;
         AV23Clicod = A252CliCod ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char2[0] = A45AlbRef ;
         GXv_int5[0] = AV24AlbRGrm2 ;
         GXv_int6[0] = AV25AlbRAnc ;
         GXv_int7[0] = AV26AlbPml ;
         new app.pgmanpm(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char2, GXv_int5, GXv_int6, GXv_int7) ;
         apdatalbrec.this.A396EmprCod = GXv_char3[0] ;
         apdatalbrec.this.A252CliCod = GXv_int4[0] ;
         apdatalbrec.this.A45AlbRef = GXv_char2[0] ;
         apdatalbrec.this.AV24AlbRGrm2 = GXv_int5[0] ;
         apdatalbrec.this.AV25AlbRAnc = GXv_int6[0] ;
         apdatalbrec.this.AV26AlbPml = GXv_int7[0] ;
         if ( A4920AlbRGrm2 == 0 )
         {
            A4920AlbRGrm2 = AV24AlbRGrm2 ;
         }
         if ( A4921AlbRAnc == 0 )
         {
            A4921AlbRAnc = AV25AlbRAnc ;
         }
         if ( A4922AlbPml == 0 )
         {
            if ( AV26AlbPml == 0 )
            {
               AV26AlbPml = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(A4920AlbRGrm2*(A4921AlbRAnc/ (double) (100))), 2))) ;
            }
            else
            {
               A4922AlbPml = AV26AlbPml ;
            }
         }
         Gx_msg = httpContext.getMessage( "Procesando Npartida= ", "") + GXutil.str( A44AlbRecCod, 8, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P04GD3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pdatalbrec.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apdatalbrec");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Station = "" ;
      AV19EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV20EmprNom = "" ;
      AV21UsurCod = "" ;
      scmdbuf = "" ;
      P04GD2_A396EmprCod = new String[] {""} ;
      P04GD2_A45AlbRef = new String[] {""} ;
      P04GD2_A252CliCod = new int[1] ;
      P04GD2_A4920AlbRGrm2 = new short[1] ;
      P04GD2_A4921AlbRAnc = new short[1] ;
      P04GD2_A4922AlbPml = new short[1] ;
      P04GD2_A44AlbRecCod = new int[1] ;
      A396EmprCod = "" ;
      A45AlbRef = "" ;
      AV22Albref = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new short[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apdatalbrec__default(),
         new Object[] {
             new Object[] {
            P04GD2_A396EmprCod, P04GD2_A45AlbRef, P04GD2_A252CliCod, P04GD2_A4920AlbRGrm2, P04GD2_A4921AlbRAnc, P04GD2_A4922AlbPml, P04GD2_A44AlbRecCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A4922AlbPml ;
   private short AV24AlbRGrm2 ;
   private short GXv_int5[] ;
   private short AV25AlbRAnc ;
   private short GXv_int6[] ;
   private short AV26AlbPml ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int AV23Clicod ;
   private int GXv_int4[] ;
   private String AV18Station ;
   private String AV19EmprCod ;
   private String GXv_char1[] ;
   private String AV20EmprNom ;
   private String AV21UsurCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String AV22Albref ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private IDataStoreProvider pr_default ;
   private String[] P04GD2_A396EmprCod ;
   private String[] P04GD2_A45AlbRef ;
   private int[] P04GD2_A252CliCod ;
   private short[] P04GD2_A4920AlbRGrm2 ;
   private short[] P04GD2_A4921AlbRAnc ;
   private short[] P04GD2_A4922AlbPml ;
   private int[] P04GD2_A44AlbRecCod ;
}

final  class apdatalbrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04GD2", "SELECT EmprCod, AlbRef, CliCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04GD3", "UPDATE TXPALBREC SET AlbRGrm2=?, AlbRAnc=?, AlbPml=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

