package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apura000 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apura000 pgm = new apura000 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apura000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apura000.class ), "" );
   }

   public apura000( int remoteHandle ,
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
      /* Using cursor P02N52 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P02N52_A396EmprCod[0] ;
         A6039RecAcab = P02N52_A6039RecAcab[0] ;
         n6039RecAcab = P02N52_n6039RecAcab[0] ;
         A129BarCod = P02N52_A129BarCod[0] ;
         A132BarCodReo = P02N52_A132BarCodReo[0] ;
         A130BarCodPar = P02N52_A130BarCodPar[0] ;
         A4268RecOrdLin = P02N52_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P02N52_n4268RecOrdLin[0] ;
         A2804RecLinMaq = P02N52_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            AV8Barcod = A129BarCod ;
            AV9barcodReo = A132BarCodReo ;
            AV10Barcodpar = A130BarCodPar ;
            AV12Emprcod = A396EmprCod ;
            /* Execute user subroutine: 'BARFAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A4268RecOrdLin = AV11RECORDLIN ;
            n4268RecOrdLin = false ;
            /* Using cursor P02N53 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n4268RecOrdLin), Short.valueOf(A4268RecOrdLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fim", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P02N54 */
      pr_default.execute(2, new Object[] {AV12Emprcod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9barcodReo), AV10Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4905BarFasAcab = P02N54_A4905BarFasAcab[0] ;
         A4287BarFasFor = P02N54_A4287BarFasFor[0] ;
         A130BarCodPar = P02N54_A130BarCodPar[0] ;
         A132BarCodReo = P02N54_A132BarCodReo[0] ;
         A129BarCod = P02N54_A129BarCod[0] ;
         A396EmprCod = P02N54_A396EmprCod[0] ;
         A194BarOrdLin = P02N54_A194BarOrdLin[0] ;
         A758ProCod = P02N54_A758ProCod[0] ;
         if ( ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV11RECORDLIN = A194BarOrdLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pura000.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apura000");
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
      P02N52_A396EmprCod = new String[] {""} ;
      P02N52_A6039RecAcab = new String[] {""} ;
      P02N52_n6039RecAcab = new boolean[] {false} ;
      P02N52_A129BarCod = new int[1] ;
      P02N52_A132BarCodReo = new byte[1] ;
      P02N52_A130BarCodPar = new String[] {""} ;
      P02N52_A4268RecOrdLin = new short[1] ;
      P02N52_n4268RecOrdLin = new boolean[] {false} ;
      P02N52_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A6039RecAcab = "" ;
      A130BarCodPar = "" ;
      AV10Barcodpar = "" ;
      AV12Emprcod = "" ;
      P02N54_A4905BarFasAcab = new String[] {""} ;
      P02N54_A4287BarFasFor = new String[] {""} ;
      P02N54_A130BarCodPar = new String[] {""} ;
      P02N54_A132BarCodReo = new byte[1] ;
      P02N54_A129BarCod = new int[1] ;
      P02N54_A396EmprCod = new String[] {""} ;
      P02N54_A194BarOrdLin = new short[1] ;
      P02N54_A758ProCod = new String[] {""} ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apura000__default(),
         new Object[] {
             new Object[] {
            P02N52_A396EmprCod, P02N52_A6039RecAcab, P02N52_n6039RecAcab, P02N52_A129BarCod, P02N52_A132BarCodReo, P02N52_A130BarCodPar, P02N52_A4268RecOrdLin, P02N52_n4268RecOrdLin, P02N52_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            P02N54_A4905BarFasAcab, P02N54_A4287BarFasFor, P02N54_A130BarCodPar, P02N54_A132BarCodReo, P02N54_A129BarCod, P02N54_A396EmprCod, P02N54_A194BarOrdLin, P02N54_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV9barcodReo ;
   private short A4268RecOrdLin ;
   private short A2804RecLinMaq ;
   private short AV11RECORDLIN ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Barcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private String AV10Barcodpar ;
   private String AV12Emprcod ;
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String A758ProCod ;
   private boolean n6039RecAcab ;
   private boolean n4268RecOrdLin ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P02N52_A396EmprCod ;
   private String[] P02N52_A6039RecAcab ;
   private boolean[] P02N52_n6039RecAcab ;
   private int[] P02N52_A129BarCod ;
   private byte[] P02N52_A132BarCodReo ;
   private String[] P02N52_A130BarCodPar ;
   private short[] P02N52_A4268RecOrdLin ;
   private boolean[] P02N52_n4268RecOrdLin ;
   private short[] P02N52_A2804RecLinMaq ;
   private String[] P02N54_A4905BarFasAcab ;
   private String[] P02N54_A4287BarFasFor ;
   private String[] P02N54_A130BarCodPar ;
   private byte[] P02N54_A132BarCodReo ;
   private int[] P02N54_A129BarCod ;
   private String[] P02N54_A396EmprCod ;
   private short[] P02N54_A194BarOrdLin ;
   private String[] P02N54_A758ProCod ;
}

final  class apura000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02N52", "SELECT EmprCod, RecAcab, BarCod, BarCodReo, BarCodPar, RecOrdLin, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = '001' ORDER BY EmprCod, RecAcab ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02N53", "UPDATE TXPRECMAQ SET RecOrdLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P02N54", "SELECT BarFasAcab, BarFasFor, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

