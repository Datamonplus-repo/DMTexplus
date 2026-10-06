package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aptxu003 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aptxu003 pgm = new aptxu003 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aptxu003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aptxu003.class ), "" );
   }

   public aptxu003( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Calculo Fac ABS Acabado", "") );
      /* Using cursor P03U62 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P03U62_A396EmprCod[0] ;
         A6039RecAcab = P03U62_A6039RecAcab[0] ;
         n6039RecAcab = P03U62_n6039RecAcab[0] ;
         A4259RecTotKgs = P03U62_A4259RecTotKgs[0] ;
         A2805RecVolPrd = P03U62_A2805RecVolPrd[0] ;
         A2806RecFA = P03U62_A2806RecFA[0] ;
         A5115RecAbsFac = P03U62_A5115RecAbsFac[0] ;
         A129BarCod = P03U62_A129BarCod[0] ;
         A132BarCodReo = P03U62_A132BarCodReo[0] ;
         A130BarCodPar = P03U62_A130BarCodPar[0] ;
         A2804RecLinMaq = P03U62_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( A4259RecTotKgs.doubleValue() > 0 )
            {
               AV8Abs = GXutil.roundDecimal( DecimalUtil.doubleToDec((A2805RecVolPrd*100)).divide(A4259RecTotKgs, 18, java.math.RoundingMode.DOWN), 0) ;
            }
            else
            {
               AV8Abs = DecimalUtil.doubleToDec(0) ;
            }
            A2806RecFA = AV8Abs ;
            A5115RecAbsFac = AV8Abs ;
            /* Using cursor P03U63 */
            pr_default.execute(1, new Object[] {A2806RecFA, A5115RecAbsFac, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Calculo Fac ABS Acabado", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(ptxu003.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aptxu003");
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
      P03U62_A396EmprCod = new String[] {""} ;
      P03U62_A6039RecAcab = new String[] {""} ;
      P03U62_n6039RecAcab = new boolean[] {false} ;
      P03U62_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U62_A2805RecVolPrd = new int[1] ;
      P03U62_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U62_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U62_A129BarCod = new int[1] ;
      P03U62_A132BarCodReo = new byte[1] ;
      P03U62_A130BarCodPar = new String[] {""} ;
      P03U62_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A2806RecFA = DecimalUtil.ZERO ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV8Abs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aptxu003__default(),
         new Object[] {
             new Object[] {
            P03U62_A396EmprCod, P03U62_A6039RecAcab, P03U62_n6039RecAcab, P03U62_A4259RecTotKgs, P03U62_A2805RecVolPrd, P03U62_A2806RecFA, P03U62_A5115RecAbsFac, P03U62_A129BarCod, P03U62_A132BarCodReo, P03U62_A130BarCodPar,
            P03U62_A2804RecLinMaq
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A2805RecVolPrd ;
   private int A129BarCod ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal AV8Abs ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A6039RecAcab ;
   private String A130BarCodPar ;
   private boolean n6039RecAcab ;
   private IDataStoreProvider pr_default ;
   private String[] P03U62_A396EmprCod ;
   private String[] P03U62_A6039RecAcab ;
   private boolean[] P03U62_n6039RecAcab ;
   private java.math.BigDecimal[] P03U62_A4259RecTotKgs ;
   private int[] P03U62_A2805RecVolPrd ;
   private java.math.BigDecimal[] P03U62_A2806RecFA ;
   private java.math.BigDecimal[] P03U62_A5115RecAbsFac ;
   private int[] P03U62_A129BarCod ;
   private byte[] P03U62_A132BarCodReo ;
   private String[] P03U62_A130BarCodPar ;
   private short[] P03U62_A2804RecLinMaq ;
}

final  class aptxu003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03U62", "SELECT EmprCod, RecAcab, RecTotKgs, RecVolPrd, RecFA, RecAbsFac, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = '001' ORDER BY EmprCod, RecAcab ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03U63", "UPDATE TXPRECMAQ SET RecFA=?, RecAbsFac=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((short[]) buf[10])[0] = rslt.getShort(10);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

