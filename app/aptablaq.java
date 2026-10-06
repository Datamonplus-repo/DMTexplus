package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptablaq extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptablaq pgm = new aptablaq (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptablaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptablaq.class ), "" );
   }

   public aptablaq( int remoteHandle ,
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
      AV21Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV22Emprcod ;
      GXv_char2[0] = AV23EmprNom ;
      GXv_char3[0] = AV24Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char1, GXv_char2, GXv_char3) ;
      aptablaq.this.AV22Emprcod = GXv_char1[0] ;
      aptablaq.this.AV23EmprNom = GXv_char2[0] ;
      aptablaq.this.AV24Usurcod = GXv_char3[0] ;
      System.out.println( httpContext.getMessage( "Tabla RECMAQ...", "") );
      /* Using cursor P03Y22 */
      pr_default.execute(0, new Object[] {AV22Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P03Y22_A2804RecLinMaq[0] ;
         A130BarCodPar = P03Y22_A130BarCodPar[0] ;
         A132BarCodReo = P03Y22_A132BarCodReo[0] ;
         A129BarCod = P03Y22_A129BarCod[0] ;
         A396EmprCod = P03Y22_A396EmprCod[0] ;
         AV17Barcod = A129BarCod ;
         AV19Barcodreo = A132BarCodReo ;
         AV18Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV20TBarpie == 0 )
         {
            /* Using cursor P03Y23 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1273RecLinPro = P03Y23_A1273RecLinPro[0] ;
               /* Optimized DELETE. */
               /* Using cursor P03Y24 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
               /* End optimized DELETE. */
               /* Using cursor P03Y25 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Optimized DELETE. */
            /* Using cursor P03Y26 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOL");
            /* End optimized DELETE. */
            /* Using cursor P03Y27 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Proceso", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV20TBarpie = (byte)(0) ;
      /* Using cursor P03Y28 */
      pr_default.execute(6, new Object[] {AV22Emprcod, Integer.valueOf(AV17Barcod), Byte.valueOf(AV19Barcodreo), AV18Barcodpar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P03Y28_A130BarCodPar[0] ;
         A132BarCodReo = P03Y28_A132BarCodReo[0] ;
         A129BarCod = P03Y28_A129BarCod[0] ;
         A396EmprCod = P03Y28_A396EmprCod[0] ;
         AV20TBarpie = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptablaq.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptablaq");
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
      AV22Emprcod = "" ;
      GXv_char1 = new String[1] ;
      AV23EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV24Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P03Y22_A2804RecLinMaq = new short[1] ;
      P03Y22_A130BarCodPar = new String[] {""} ;
      P03Y22_A132BarCodReo = new byte[1] ;
      P03Y22_A129BarCod = new int[1] ;
      P03Y22_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV18Barcodpar = "" ;
      P03Y23_A396EmprCod = new String[] {""} ;
      P03Y23_A129BarCod = new int[1] ;
      P03Y23_A132BarCodReo = new byte[1] ;
      P03Y23_A130BarCodPar = new String[] {""} ;
      P03Y23_A2804RecLinMaq = new short[1] ;
      P03Y23_A1273RecLinPro = new byte[1] ;
      P03Y28_A130BarCodPar = new String[] {""} ;
      P03Y28_A132BarCodReo = new byte[1] ;
      P03Y28_A129BarCod = new int[1] ;
      P03Y28_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptablaq__default(),
         new Object[] {
             new Object[] {
            P03Y22_A2804RecLinMaq, P03Y22_A130BarCodPar, P03Y22_A132BarCodReo, P03Y22_A129BarCod, P03Y22_A396EmprCod
            }
            , new Object[] {
            P03Y23_A396EmprCod, P03Y23_A129BarCod, P03Y23_A132BarCodReo, P03Y23_A130BarCodPar, P03Y23_A2804RecLinMaq, P03Y23_A1273RecLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P03Y28_A130BarCodPar, P03Y28_A132BarCodReo, P03Y28_A129BarCod, P03Y28_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV19Barcodreo ;
   private byte AV20TBarpie ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV17Barcod ;
   private String AV21Station ;
   private String AV22Emprcod ;
   private String GXv_char1[] ;
   private String AV23EmprNom ;
   private String GXv_char2[] ;
   private String AV24Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV18Barcodpar ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private short[] P03Y22_A2804RecLinMaq ;
   private String[] P03Y22_A130BarCodPar ;
   private byte[] P03Y22_A132BarCodReo ;
   private int[] P03Y22_A129BarCod ;
   private String[] P03Y22_A396EmprCod ;
   private String[] P03Y23_A396EmprCod ;
   private int[] P03Y23_A129BarCod ;
   private byte[] P03Y23_A132BarCodReo ;
   private String[] P03Y23_A130BarCodPar ;
   private short[] P03Y23_A2804RecLinMaq ;
   private byte[] P03Y23_A1273RecLinPro ;
   private String[] P03Y28_A130BarCodPar ;
   private byte[] P03Y28_A132BarCodReo ;
   private int[] P03Y28_A129BarCod ;
   private String[] P03Y28_A396EmprCod ;
}

final  class aptablaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03Y22", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPRECMAQ WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03Y23", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03Y24", "DELETE FROM TXPLRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P03Y25", "DELETE FROM TXPCRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P03Y26", "DELETE FROM TXPRECCOL  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECCOL")
         ,new UpdateCursor("P03Y27", "DELETE FROM TXPRECMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P03Y28", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

