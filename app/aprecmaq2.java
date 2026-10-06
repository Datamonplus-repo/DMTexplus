package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aprecmaq2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aprecmaq2 pgm = new aprecmaq2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aprecmaq2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprecmaq2.class ), "" );
   }

   public aprecmaq2( int remoteHandle ,
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
      /* Using cursor P00LL2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P00LL2_A602MaqCod[0] ;
         A180BarMaqCod = P00LL2_A180BarMaqCod[0] ;
         A2804RecLinMaq = P00LL2_A2804RecLinMaq[0] ;
         A130BarCodPar = P00LL2_A130BarCodPar[0] ;
         A132BarCodReo = P00LL2_A132BarCodReo[0] ;
         A129BarCod = P00LL2_A129BarCod[0] ;
         A396EmprCod = P00LL2_A396EmprCod[0] ;
         A180BarMaqCod = P00LL2_A180BarMaqCod[0] ;
         if ( (GXutil.strcmp("", A602MaqCod)==0) )
         {
            A602MaqCod = A180BarMaqCod ;
         }
         /* Using cursor P00LL3 */
         pr_default.execute(1, new Object[] {A602MaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(precmaq2.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aprecmaq2");
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
      P00LL2_A602MaqCod = new String[] {""} ;
      P00LL2_A180BarMaqCod = new String[] {""} ;
      P00LL2_A2804RecLinMaq = new short[1] ;
      P00LL2_A130BarCodPar = new String[] {""} ;
      P00LL2_A132BarCodReo = new byte[1] ;
      P00LL2_A129BarCod = new int[1] ;
      P00LL2_A396EmprCod = new String[] {""} ;
      A602MaqCod = "" ;
      A180BarMaqCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aprecmaq2__default(),
         new Object[] {
             new Object[] {
            P00LL2_A602MaqCod, P00LL2_A180BarMaqCod, P00LL2_A2804RecLinMaq, P00LL2_A130BarCodPar, P00LL2_A132BarCodReo, P00LL2_A129BarCod, P00LL2_A396EmprCod
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
   private int A129BarCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A180BarMaqCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private String[] P00LL2_A602MaqCod ;
   private String[] P00LL2_A180BarMaqCod ;
   private short[] P00LL2_A2804RecLinMaq ;
   private String[] P00LL2_A130BarCodPar ;
   private byte[] P00LL2_A132BarCodReo ;
   private int[] P00LL2_A129BarCod ;
   private String[] P00LL2_A396EmprCod ;
}

final  class aprecmaq2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00LL2", "SELECT T1.MaqCod, T2.BarMaqCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00LL3", "UPDATE TXPRECMAQ SET MaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

