package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aphisreofec extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aphisreofec pgm = new aphisreofec (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aphisreofec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aphisreofec.class ), "" );
   }

   public aphisreofec( int remoteHandle ,
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
      AV18Emprcod = "001" ;
      /* Using cursor P045W2 */
      pr_default.execute(0, new Object[] {AV18Emprcod, AV19Fec1, AV20fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P045W2_A396EmprCod[0] ;
         A148BarEstReo = P045W2_A148BarEstReo[0] ;
         A159BarFecGen = P045W2_A159BarFecGen[0] ;
         A129BarCod = P045W2_A129BarCod[0] ;
         A132BarCodReo = P045W2_A132BarCodReo[0] ;
         A130BarCodPar = P045W2_A130BarCodPar[0] ;
         A9790BarItem6 = P045W2_A9790BarItem6[0] ;
         AV21BarCod = A129BarCod ;
         AV22Barcodreo = A132BarCodReo ;
         AV23Barcodpar = A130BarCodPar ;
         AV24Barfecgen = A159BarFecGen ;
         Gx_msg = httpContext.getMessage( "Procesando...", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         System.out.println( Gx_msg );
         /* Execute user subroutine: 'HISREO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV26CamF == 1 )
         {
            A9790BarItem6 = localUtil.dtoc( AV25Hisreofec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            Gx_msg = httpContext.getMessage( "Cambio...", "") + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P045W3 */
         pr_default.execute(1, new Object[] {A9790BarItem6, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'HISREO' Routine */
      returnInSub = false ;
      AV25Hisreofec = GXutil.nullDate() ;
      AV26CamF = (byte)(0) ;
      /* Using cursor P045W4 */
      pr_default.execute(2, new Object[] {AV18Emprcod, Integer.valueOf(AV21BarCod), Byte.valueOf(AV22Barcodreo), AV23Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A544HisCodPar = P045W4_A544HisCodPar[0] ;
         A545HisCodReo = P045W4_A545HisCodReo[0] ;
         A539HisBarCod = P045W4_A539HisBarCod[0] ;
         A396EmprCod = P045W4_A396EmprCod[0] ;
         A569HisReoFec = P045W4_A569HisReoFec[0] ;
         n569HisReoFec = P045W4_n569HisReoFec[0] ;
         A833TipDefCod = P045W4_A833TipDefCod[0] ;
         if ( !( GXutil.dateCompare(GXutil.resetTime(A569HisReoFec), GXutil.resetTime(AV24Barfecgen)) ) )
         {
            AV26CamF = (byte)(1) ;
            AV25Hisreofec = A569HisReoFec ;
            A569HisReoFec = AV24Barfecgen ;
            n569HisReoFec = false ;
         }
         /* Using cursor P045W5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n569HisReoFec), A569HisReoFec, A396EmprCod, Integer.valueOf(A539HisBarCod), Byte.valueOf(A545HisCodReo), A544HisCodPar, Short.valueOf(A833TipDefCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(phisreofec.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aphisreofec");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Emprcod = "" ;
      scmdbuf = "" ;
      AV19Fec1 = GXutil.nullDate() ;
      AV20fec2 = GXutil.nullDate() ;
      P045W2_A396EmprCod = new String[] {""} ;
      P045W2_A148BarEstReo = new byte[1] ;
      P045W2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P045W2_A129BarCod = new int[1] ;
      P045W2_A132BarCodReo = new byte[1] ;
      P045W2_A130BarCodPar = new String[] {""} ;
      P045W2_A9790BarItem6 = new String[] {""} ;
      A396EmprCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A9790BarItem6 = "" ;
      AV23Barcodpar = "" ;
      AV24Barfecgen = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV25Hisreofec = GXutil.nullDate() ;
      P045W4_A544HisCodPar = new String[] {""} ;
      P045W4_A545HisCodReo = new byte[1] ;
      P045W4_A539HisBarCod = new int[1] ;
      P045W4_A396EmprCod = new String[] {""} ;
      P045W4_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P045W4_n569HisReoFec = new boolean[] {false} ;
      P045W4_A833TipDefCod = new short[1] ;
      A544HisCodPar = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aphisreofec__default(),
         new Object[] {
             new Object[] {
            P045W2_A396EmprCod, P045W2_A148BarEstReo, P045W2_A159BarFecGen, P045W2_A129BarCod, P045W2_A132BarCodReo, P045W2_A130BarCodPar, P045W2_A9790BarItem6
            }
            , new Object[] {
            }
            , new Object[] {
            P045W4_A544HisCodPar, P045W4_A545HisCodReo, P045W4_A539HisBarCod, P045W4_A396EmprCod, P045W4_A569HisReoFec, P045W4_n569HisReoFec, P045W4_A833TipDefCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV22Barcodreo ;
   private byte AV26CamF ;
   private byte A545HisCodReo ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV21BarCod ;
   private int A539HisBarCod ;
   private String AV18Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A9790BarItem6 ;
   private String AV23Barcodpar ;
   private String Gx_msg ;
   private String A544HisCodPar ;
   private java.util.Date AV19Fec1 ;
   private java.util.Date AV20fec2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV24Barfecgen ;
   private java.util.Date AV25Hisreofec ;
   private java.util.Date A569HisReoFec ;
   private boolean returnInSub ;
   private boolean n569HisReoFec ;
   private IDataStoreProvider pr_default ;
   private String[] P045W2_A396EmprCod ;
   private byte[] P045W2_A148BarEstReo ;
   private java.util.Date[] P045W2_A159BarFecGen ;
   private int[] P045W2_A129BarCod ;
   private byte[] P045W2_A132BarCodReo ;
   private String[] P045W2_A130BarCodPar ;
   private String[] P045W2_A9790BarItem6 ;
   private String[] P045W4_A544HisCodPar ;
   private byte[] P045W4_A545HisCodReo ;
   private int[] P045W4_A539HisBarCod ;
   private String[] P045W4_A396EmprCod ;
   private java.util.Date[] P045W4_A569HisReoFec ;
   private boolean[] P045W4_n569HisReoFec ;
   private short[] P045W4_A833TipDefCod ;
}

final  class aphisreofec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P045W2", "SELECT EmprCod, BarEstReo, BarFecGen, BarCod, BarCodReo, BarCodPar, BarItem6 FROM TXPBARCAD WHERE (EmprCod = ? and BarFecGen >= ?) AND (BarEstReo = 2) AND (BarFecGen <= ?) ORDER BY EmprCod, BarFecGen ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P045W3", "UPDATE TXPBARCAD SET BarItem6=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P045W4", "SELECT HisCodPar, HisCodReo, HisBarCod, EmprCod, HisReoFec, TipDefCod FROM TXPHISREO WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ? ORDER BY EmprCod, HisBarCod, HisCodReo, HisCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P045W5", "UPDATE TXPHISREO SET HisReoFec=?  WHERE EmprCod = ? AND HisBarCod = ? AND HisCodReo = ? AND HisCodPar = ? AND TipDefCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

