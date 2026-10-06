package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsu0003 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsu0003 pgm = new apsu0003 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsu0003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsu0003.class ), "" );
   }

   public apsu0003( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Actualizo Seccion en BARFAS", "") );
      /* Using cursor P02RB2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P02RB2_A457FasCod[0] ;
         A6162SecCodF = P02RB2_A6162SecCodF[0] ;
         n6162SecCodF = P02RB2_n6162SecCodF[0] ;
         A6173BarFasSec = P02RB2_A6173BarFasSec[0] ;
         n6173BarFasSec = P02RB2_n6173BarFasSec[0] ;
         A130BarCodPar = P02RB2_A130BarCodPar[0] ;
         A132BarCodReo = P02RB2_A132BarCodReo[0] ;
         A129BarCod = P02RB2_A129BarCod[0] ;
         A396EmprCod = P02RB2_A396EmprCod[0] ;
         A758ProCod = P02RB2_A758ProCod[0] ;
         A194BarOrdLin = P02RB2_A194BarOrdLin[0] ;
         A6162SecCodF = P02RB2_A6162SecCodF[0] ;
         n6162SecCodF = P02RB2_n6162SecCodF[0] ;
         A6173BarFasSec = A6162SecCodF ;
         n6173BarFasSec = false ;
         /* Using cursor P02RB3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin Actualizo Seccion en BARFAS", "") );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psu0003.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsu0003");
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
      P02RB2_A457FasCod = new String[] {""} ;
      P02RB2_A6162SecCodF = new String[] {""} ;
      P02RB2_n6162SecCodF = new boolean[] {false} ;
      P02RB2_A6173BarFasSec = new String[] {""} ;
      P02RB2_n6173BarFasSec = new boolean[] {false} ;
      P02RB2_A130BarCodPar = new String[] {""} ;
      P02RB2_A132BarCodReo = new byte[1] ;
      P02RB2_A129BarCod = new int[1] ;
      P02RB2_A396EmprCod = new String[] {""} ;
      P02RB2_A758ProCod = new String[] {""} ;
      P02RB2_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A6162SecCodF = "" ;
      A6173BarFasSec = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsu0003__default(),
         new Object[] {
             new Object[] {
            P02RB2_A457FasCod, P02RB2_A6162SecCodF, P02RB2_n6162SecCodF, P02RB2_A6173BarFasSec, P02RB2_n6173BarFasSec, P02RB2_A130BarCodPar, P02RB2_A132BarCodReo, P02RB2_A129BarCod, P02RB2_A396EmprCod, P02RB2_A758ProCod,
            P02RB2_A194BarOrdLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A6162SecCodF ;
   private String A6173BarFasSec ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private boolean n6162SecCodF ;
   private boolean n6173BarFasSec ;
   private IDataStoreProvider pr_default ;
   private String[] P02RB2_A457FasCod ;
   private String[] P02RB2_A6162SecCodF ;
   private boolean[] P02RB2_n6162SecCodF ;
   private String[] P02RB2_A6173BarFasSec ;
   private boolean[] P02RB2_n6173BarFasSec ;
   private String[] P02RB2_A130BarCodPar ;
   private byte[] P02RB2_A132BarCodReo ;
   private int[] P02RB2_A129BarCod ;
   private String[] P02RB2_A396EmprCod ;
   private String[] P02RB2_A758ProCod ;
   private short[] P02RB2_A194BarOrdLin ;
}

final  class apsu0003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02RB2", "SELECT T1.FasCod, T2.SecCodF, T1.BarFasSec, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.ProCod, T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02RB3", "UPDATE TXPBARFAS SET BarFasSec=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

