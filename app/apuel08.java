package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuel08 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuel08 pgm = new apuel08 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apuel08( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuel08.class ), "" );
   }

   public apuel08( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Empieza el proceso ¡¡¡", "") );
      /* Using cursor P03F12 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P03F12_A2804RecLinMaq[0] ;
         A130BarCodPar = P03F12_A130BarCodPar[0] ;
         A132BarCodReo = P03F12_A132BarCodReo[0] ;
         A129BarCod = P03F12_A129BarCod[0] ;
         A396EmprCod = P03F12_A396EmprCod[0] ;
         /* Using cursor P03F13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A4464BarAcaFor = P03F13_A4464BarAcaFor[0] ;
         n4464BarAcaFor = P03F13_n4464BarAcaFor[0] ;
         AV8Baracafor = 0 ;
         /* Using cursor P03F14 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A683PrdCanFin = P03F14_A683PrdCanFin[0] ;
            A811RecLin = P03F14_A811RecLin[0] ;
            A1273RecLinPro = P03F14_A1273RecLinPro[0] ;
            if ( A683PrdCanFin.doubleValue() > 0 )
            {
               AV8Baracafor = 1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A4464BarAcaFor = AV8Baracafor ;
         n4464BarAcaFor = false ;
         /* Using cursor P03F15 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n4464BarAcaFor), Integer.valueOf(A4464BarAcaFor), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puel08.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apuel08");
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
      P03F12_A2804RecLinMaq = new short[1] ;
      P03F12_A130BarCodPar = new String[] {""} ;
      P03F12_A132BarCodReo = new byte[1] ;
      P03F12_A129BarCod = new int[1] ;
      P03F12_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P03F13_A4464BarAcaFor = new int[1] ;
      P03F13_n4464BarAcaFor = new boolean[] {false} ;
      P03F14_A396EmprCod = new String[] {""} ;
      P03F14_A129BarCod = new int[1] ;
      P03F14_A132BarCodReo = new byte[1] ;
      P03F14_A130BarCodPar = new String[] {""} ;
      P03F14_A2804RecLinMaq = new short[1] ;
      P03F14_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03F14_A811RecLin = new short[1] ;
      P03F14_A1273RecLinPro = new byte[1] ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuel08__default(),
         new Object[] {
             new Object[] {
            P03F12_A2804RecLinMaq, P03F12_A130BarCodPar, P03F12_A132BarCodReo, P03F12_A129BarCod, P03F12_A396EmprCod
            }
            , new Object[] {
            P03F13_A4464BarAcaFor, P03F13_n4464BarAcaFor
            }
            , new Object[] {
            P03F14_A396EmprCod, P03F14_A129BarCod, P03F14_A132BarCodReo, P03F14_A130BarCodPar, P03F14_A2804RecLinMaq, P03F14_A683PrdCanFin, P03F14_A811RecLin, P03F14_A1273RecLinPro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4464BarAcaFor ;
   private int AV8Baracafor ;
   private java.math.BigDecimal A683PrdCanFin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private boolean n4464BarAcaFor ;
   private IDataStoreProvider pr_default ;
   private short[] P03F12_A2804RecLinMaq ;
   private String[] P03F12_A130BarCodPar ;
   private byte[] P03F12_A132BarCodReo ;
   private int[] P03F12_A129BarCod ;
   private String[] P03F12_A396EmprCod ;
   private int[] P03F13_A4464BarAcaFor ;
   private boolean[] P03F13_n4464BarAcaFor ;
   private String[] P03F14_A396EmprCod ;
   private int[] P03F14_A129BarCod ;
   private byte[] P03F14_A132BarCodReo ;
   private String[] P03F14_A130BarCodPar ;
   private short[] P03F14_A2804RecLinMaq ;
   private java.math.BigDecimal[] P03F14_A683PrdCanFin ;
   private short[] P03F14_A811RecLin ;
   private byte[] P03F14_A1273RecLinPro ;
}

final  class apuel08__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03F12", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPRECMAQ WHERE (EmprCod = '001' AND BarCod > 1) AND (EmprCod = '001' and BarCod > 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03F13", "SELECT BarAcaFor FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03F14", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, PrdCanFin, RecLin, RecLinPro FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03F15", "UPDATE TXPBARCAD SET BarAcaFor=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
      }
   }

}

