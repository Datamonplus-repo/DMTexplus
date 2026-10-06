package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class appesestampacion extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      appesestampacion pgm = new appesestampacion (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public appesestampacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appesestampacion.class ), "" );
   }

   public appesestampacion( int remoteHandle ,
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
      AV21Station = context.getWorkstationId( remoteHandle) ;
      /* Using cursor P04L62 */
      pr_default.execute(0, new Object[] {AV21Station});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8899TermPes = P04L62_A8899TermPes[0] ;
         n8899TermPes = P04L62_n8899TermPes[0] ;
         A942TermCod = P04L62_A942TermCod[0] ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Estación no configurada para pesaje.", ""));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_char1[0] = AV22EmprCod ;
      GXv_char2[0] = "" ;
      GXv_char3[0] = "" ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char1, GXv_char2, GXv_char3) ;
      appesestampacion.this.AV22EmprCod = GXv_char1[0] ;
      GXt_int4 = AV44PesColNC ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "PECONC", ""), GXv_int5) ;
      appesestampacion.this.GXt_int4 = GXv_int5[0] ;
      AV44PesColNC = GXt_int4 ;
      GXt_int4 = AV45NoVerPrd ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV22EmprCod, httpContext.getMessage( "NOVERP", ""), GXv_int5) ;
      appesestampacion.this.GXt_int4 = GXv_int5[0] ;
      AV45NoVerPrd = GXt_int4 ;
      AV18OkOpe = (byte)(1) ;
      while ( AV18OkOpe == 1 )
      {
         AV18OkOpe = (byte)(((AV19OpeCod>0) ? 1 : 0)) ;
         if ( AV18OkOpe == 1 )
         {
            AV26OkHDR = (byte)(((AV23BarCod>0) ? 1 : 0)) ;
            if ( AV26OkHDR == 1 )
            {
               AV43Cont = (short)(0) ;
               /* Using cursor P04L63 */
               pr_default.execute(1, new Object[] {AV22EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV25BarCodReo), AV24BarCodPar});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A130BarCodPar = P04L63_A130BarCodPar[0] ;
                  A132BarCodReo = P04L63_A132BarCodReo[0] ;
                  A129BarCod = P04L63_A129BarCod[0] ;
                  A396EmprCod = P04L63_A396EmprCod[0] ;
                  A2126RecMolLin = P04L63_A2126RecMolLin[0] ;
                  A2124RecMolCod = P04L63_A2124RecMolCod[0] ;
                  A1032FonCod = P04L63_A1032FonCod[0] ;
                  A1056DisComCod = P04L63_A1056DisComCod[0] ;
                  A2524DisComLin = P04L63_A2524DisComLin[0] ;
                  AV46RecMolLin = A2126RecMolLin ;
                  AV43Cont = (short)(AV43Cont+1) ;
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               if ( AV43Cont == 0 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. NO hay Receta", ""));
               }
               else
               {
               }
            }
            else
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Codigo Hdr", ""));
            }
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Codigo Operario", ""));
         }
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ppesestampacion.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Station = "" ;
      scmdbuf = "" ;
      P04L62_A8899TermPes = new byte[1] ;
      P04L62_n8899TermPes = new boolean[] {false} ;
      P04L62_A942TermCod = new String[] {""} ;
      A942TermCod = "" ;
      AV22EmprCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      AV24BarCodPar = "" ;
      P04L63_A130BarCodPar = new String[] {""} ;
      P04L63_A132BarCodReo = new byte[1] ;
      P04L63_A129BarCod = new int[1] ;
      P04L63_A396EmprCod = new String[] {""} ;
      P04L63_A2126RecMolLin = new byte[1] ;
      P04L63_A2124RecMolCod = new byte[1] ;
      P04L63_A1032FonCod = new String[] {""} ;
      P04L63_A1056DisComCod = new String[] {""} ;
      P04L63_A2524DisComLin = new byte[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.appesestampacion__default(),
         new Object[] {
             new Object[] {
            P04L62_A8899TermPes, P04L62_n8899TermPes, P04L62_A942TermCod
            }
            , new Object[] {
            P04L63_A130BarCodPar, P04L63_A132BarCodReo, P04L63_A129BarCod, P04L63_A396EmprCod, P04L63_A2126RecMolLin, P04L63_A2124RecMolCod, P04L63_A1032FonCod, P04L63_A1056DisComCod, P04L63_A2524DisComLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8899TermPes ;
   private byte AV44PesColNC ;
   private byte AV45NoVerPrd ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private byte AV18OkOpe ;
   private byte AV26OkHDR ;
   private byte AV25BarCodReo ;
   private byte A132BarCodReo ;
   private byte A2126RecMolLin ;
   private byte A2124RecMolCod ;
   private byte A2524DisComLin ;
   private byte AV46RecMolLin ;
   private short AV43Cont ;
   private short Gx_err ;
   private int AV19OpeCod ;
   private int AV23BarCod ;
   private int A129BarCod ;
   private String AV21Station ;
   private String scmdbuf ;
   private String A942TermCod ;
   private String AV22EmprCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV24BarCodPar ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private boolean n8899TermPes ;
   private IDataStoreProvider pr_default ;
   private byte[] P04L62_A8899TermPes ;
   private boolean[] P04L62_n8899TermPes ;
   private String[] P04L62_A942TermCod ;
   private String[] P04L63_A130BarCodPar ;
   private byte[] P04L63_A132BarCodReo ;
   private int[] P04L63_A129BarCod ;
   private String[] P04L63_A396EmprCod ;
   private byte[] P04L63_A2126RecMolLin ;
   private byte[] P04L63_A2124RecMolCod ;
   private String[] P04L63_A1032FonCod ;
   private String[] P04L63_A1056DisComCod ;
   private byte[] P04L63_A2524DisComLin ;
}

final  class appesestampacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04L62", "SELECT TermPes, TermCod FROM TXPTERMIN WHERE (TermCod = ?) AND (TermPes = 0) ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04L63", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, RecMolLin, RecMolCod, FonCod, DisComCod, DisComLin FROM TXPRECPRD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
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
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

