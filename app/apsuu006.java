package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu006 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu006 pgm = new apsuu006 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu006.class ), "" );
   }

   public apsuu006( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Control fases ARRANQUE..", "") );
      /* Using cursor P02TY2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02TY2_A361DisCod[0] ;
         A396EmprCod = P02TY2_A396EmprCod[0] ;
         A129BarCod = P02TY2_A129BarCod[0] ;
         A132BarCodReo = P02TY2_A132BarCodReo[0] ;
         A130BarCodPar = P02TY2_A130BarCodPar[0] ;
         AV14Emprcod = A396EmprCod ;
         AV15barcod = A129BarCod ;
         AV16Barcodreo = A132BarCodReo ;
         AV17Barcodpar = A130BarCodPar ;
         /* Execute user subroutine: 'BARFAS' */
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
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV18Arranque = (byte)(0) ;
      /* Using cursor P02TY3 */
      pr_default.execute(1, new Object[] {AV14Emprcod, Integer.valueOf(AV15barcod), Byte.valueOf(AV16Barcodreo), AV17Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P02TY3_A130BarCodPar[0] ;
         A132BarCodReo = P02TY3_A132BarCodReo[0] ;
         A129BarCod = P02TY3_A129BarCod[0] ;
         A396EmprCod = P02TY3_A396EmprCod[0] ;
         A5048BarFasUsu = P02TY3_A5048BarFasUsu[0] ;
         n5048BarFasUsu = P02TY3_n5048BarFasUsu[0] ;
         A153BarFasEst = P02TY3_A153BarFasEst[0] ;
         A457FasCod = P02TY3_A457FasCod[0] ;
         A194BarOrdLin = P02TY3_A194BarOrdLin[0] ;
         A758ProCod = P02TY3_A758ProCod[0] ;
         if ( GXutil.strcmp(A5048BarFasUsu, httpContext.getMessage( "Arranque", "")) == 0 )
         {
            AV18Arranque = (byte)(1) ;
         }
         if ( ( GXutil.strcmp(A5048BarFasUsu, " ") == 0 ) && ( A153BarFasEst == 2 ) )
         {
            A153BarFasEst = (byte)(0) ;
            Gx_msg = httpContext.getMessage( "Fase Actualizada=", "") + A457FasCod ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P02TY4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A153BarFasEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu006.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu006");
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
      P02TY2_A361DisCod = new int[1] ;
      P02TY2_A396EmprCod = new String[] {""} ;
      P02TY2_A129BarCod = new int[1] ;
      P02TY2_A132BarCodReo = new byte[1] ;
      P02TY2_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV14Emprcod = "" ;
      AV17Barcodpar = "" ;
      P02TY3_A130BarCodPar = new String[] {""} ;
      P02TY3_A132BarCodReo = new byte[1] ;
      P02TY3_A129BarCod = new int[1] ;
      P02TY3_A396EmprCod = new String[] {""} ;
      P02TY3_A5048BarFasUsu = new String[] {""} ;
      P02TY3_n5048BarFasUsu = new boolean[] {false} ;
      P02TY3_A153BarFasEst = new byte[1] ;
      P02TY3_A457FasCod = new String[] {""} ;
      P02TY3_A194BarOrdLin = new short[1] ;
      P02TY3_A758ProCod = new String[] {""} ;
      A5048BarFasUsu = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu006__default(),
         new Object[] {
             new Object[] {
            P02TY2_A361DisCod, P02TY2_A396EmprCod, P02TY2_A129BarCod, P02TY2_A132BarCodReo, P02TY2_A130BarCodPar
            }
            , new Object[] {
            P02TY3_A130BarCodPar, P02TY3_A132BarCodReo, P02TY3_A129BarCod, P02TY3_A396EmprCod, P02TY3_A5048BarFasUsu, P02TY3_n5048BarFasUsu, P02TY3_A153BarFasEst, P02TY3_A457FasCod, P02TY3_A194BarOrdLin, P02TY3_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV16Barcodreo ;
   private byte AV18Arranque ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int AV15barcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV14Emprcod ;
   private String AV17Barcodpar ;
   private String A5048BarFasUsu ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String Gx_msg ;
   private boolean returnInSub ;
   private boolean n5048BarFasUsu ;
   private IDataStoreProvider pr_default ;
   private int[] P02TY2_A361DisCod ;
   private String[] P02TY2_A396EmprCod ;
   private int[] P02TY2_A129BarCod ;
   private byte[] P02TY2_A132BarCodReo ;
   private String[] P02TY2_A130BarCodPar ;
   private String[] P02TY3_A130BarCodPar ;
   private byte[] P02TY3_A132BarCodReo ;
   private int[] P02TY3_A129BarCod ;
   private String[] P02TY3_A396EmprCod ;
   private String[] P02TY3_A5048BarFasUsu ;
   private boolean[] P02TY3_n5048BarFasUsu ;
   private byte[] P02TY3_A153BarFasEst ;
   private String[] P02TY3_A457FasCod ;
   private short[] P02TY3_A194BarOrdLin ;
   private String[] P02TY3_A758ProCod ;
}

final  class apsuu006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02TY2", "SELECT DisCod, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE (EmprCod = '001') AND (DisCod <= 324) ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02TY3", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarFasUsu, BarFasEst, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TY4", "UPDATE TXPBARFAS SET BarFasEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

