package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptexu03 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptexu03 pgm = new aptexu03 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptexu03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptexu03.class ), "" );
   }

   public aptexu03( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Procesando tabla ALBREC...Sem Malha...", "") );
      /* Using cursor P02UN2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1211TipEntCod = P02UN2_A1211TipEntCod[0] ;
         n1211TipEntCod = P02UN2_n1211TipEntCod[0] ;
         A396EmprCod = P02UN2_A396EmprCod[0] ;
         A50AlbRLoc = P02UN2_A50AlbRLoc[0] ;
         A44AlbRecCod = P02UN2_A44AlbRecCod[0] ;
         AV16ALBRLOC = A50AlbRLoc ;
         AV18Emprcod = A396EmprCod ;
         AV17Albreccod = A44AlbRecCod ;
         /* Execute user subroutine: 'BARPIE' */
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
      System.out.println( httpContext.getMessage( "Fin Procesando tabla ALBREC...Sem Malha...", "") );
      cleanup();
   }

   public void S111( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      /* Using cursor P02UN3 */
      pr_default.execute(1, new Object[] {AV18Emprcod, Integer.valueOf(AV17Albreccod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A44AlbRecCod = P02UN3_A44AlbRecCod[0] ;
         A396EmprCod = P02UN3_A396EmprCod[0] ;
         A2186BarPieLoc = P02UN3_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P02UN3_n2186BarPieLoc[0] ;
         A129BarCod = P02UN3_A129BarCod[0] ;
         A132BarCodReo = P02UN3_A132BarCodReo[0] ;
         A130BarCodPar = P02UN3_A130BarCodPar[0] ;
         A200BarPieCod = P02UN3_A200BarPieCod[0] ;
         if ( GXutil.strcmp(A2186BarPieLoc, httpContext.getMessage( "Sem Malha ", "")) != 0 )
         {
            A2186BarPieLoc = AV16ALBRLOC ;
            n2186BarPieLoc = false ;
            Gx_msg = httpContext.getMessage( "Barcod =", "") + GXutil.str( A129BarCod, 8, 0) + " " + AV16ALBRLOC ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P02UN4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptexu03.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptexu03");
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
      P02UN2_A1211TipEntCod = new short[1] ;
      P02UN2_n1211TipEntCod = new boolean[] {false} ;
      P02UN2_A396EmprCod = new String[] {""} ;
      P02UN2_A50AlbRLoc = new String[] {""} ;
      P02UN2_A44AlbRecCod = new int[1] ;
      A396EmprCod = "" ;
      A50AlbRLoc = "" ;
      AV16ALBRLOC = "" ;
      AV18Emprcod = "" ;
      P02UN3_A44AlbRecCod = new int[1] ;
      P02UN3_A396EmprCod = new String[] {""} ;
      P02UN3_A2186BarPieLoc = new String[] {""} ;
      P02UN3_n2186BarPieLoc = new boolean[] {false} ;
      P02UN3_A129BarCod = new int[1] ;
      P02UN3_A132BarCodReo = new byte[1] ;
      P02UN3_A130BarCodPar = new String[] {""} ;
      P02UN3_A200BarPieCod = new String[] {""} ;
      A2186BarPieLoc = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptexu03__default(),
         new Object[] {
             new Object[] {
            P02UN2_A1211TipEntCod, P02UN2_n1211TipEntCod, P02UN2_A396EmprCod, P02UN2_A50AlbRLoc, P02UN2_A44AlbRecCod
            }
            , new Object[] {
            P02UN3_A44AlbRecCod, P02UN3_A396EmprCod, P02UN3_A2186BarPieLoc, P02UN3_n2186BarPieLoc, P02UN3_A129BarCod, P02UN3_A132BarCodReo, P02UN3_A130BarCodPar, P02UN3_A200BarPieCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int A44AlbRecCod ;
   private int AV17Albreccod ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A50AlbRLoc ;
   private String AV16ALBRLOC ;
   private String AV18Emprcod ;
   private String A2186BarPieLoc ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String Gx_msg ;
   private boolean n1211TipEntCod ;
   private boolean returnInSub ;
   private boolean n2186BarPieLoc ;
   private IDataStoreProvider pr_default ;
   private short[] P02UN2_A1211TipEntCod ;
   private boolean[] P02UN2_n1211TipEntCod ;
   private String[] P02UN2_A396EmprCod ;
   private String[] P02UN2_A50AlbRLoc ;
   private int[] P02UN2_A44AlbRecCod ;
   private int[] P02UN3_A44AlbRecCod ;
   private String[] P02UN3_A396EmprCod ;
   private String[] P02UN3_A2186BarPieLoc ;
   private boolean[] P02UN3_n2186BarPieLoc ;
   private int[] P02UN3_A129BarCod ;
   private byte[] P02UN3_A132BarCodReo ;
   private String[] P02UN3_A130BarCodPar ;
   private String[] P02UN3_A200BarPieCod ;
}

final  class aptexu03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02UN2", "SELECT TipEntCod, EmprCod, AlbRLoc, AlbRecCod FROM TXPALBREC WHERE EmprCod = '001' and TipEntCod = 9999 ORDER BY EmprCod, TipEntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02UN3", "SELECT AlbRecCod, EmprCod, BarPieLoc, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02UN4", "UPDATE TXPBARPIE SET BarPieLoc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 9);
               return;
      }
   }

}

