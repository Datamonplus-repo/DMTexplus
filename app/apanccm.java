package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apanccm extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apanccm pgm = new apanccm (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apanccm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apanccm.class ), "" );
   }

   public apanccm( int remoteHandle ,
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
      /* Using cursor P03WJ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03WJ2_A130BarCodPar[0] ;
         A132BarCodReo = P03WJ2_A132BarCodReo[0] ;
         A129BarCod = P03WJ2_A129BarCod[0] ;
         A396EmprCod = P03WJ2_A396EmprCod[0] ;
         A213BarSit = P03WJ2_A213BarSit[0] ;
         A127BarAncCru1 = P03WJ2_A127BarAncCru1[0] ;
         AV12N_p = (short)(0) ;
         AV13MedAncc = 0 ;
         /* Optimized group. */
         /* Using cursor P03WJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         cV12N_p = P03WJ3_AV12N_p[0] ;
         c9846BarPieAncc = P03WJ3_A9846BarPieAncc[0] ;
         n9846BarPieAncc = P03WJ3_n9846BarPieAncc[0] ;
         pr_default.close(1);
         AV12N_p = (short)(AV12N_p+cV12N_p*1) ;
         AV13MedAncc = (int)(AV13MedAncc+c9846BarPieAncc) ;
         /* End optimized group. */
         AV14Ancc = (short)(0) ;
         if ( AV12N_p > 0 )
         {
            AV14Ancc = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(AV13MedAncc/ (double) (AV12N_p)), 0))) ;
         }
         A127BarAncCru1 = AV14Ancc ;
         Gx_msg = httpContext.getMessage( "Hdr= ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + httpContext.getMessage( " Anc C= ", "") + GXutil.str( AV14Ancc, 3, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P03WJ4 */
         pr_default.execute(2, new Object[] {Short.valueOf(A127BarAncCru1), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(panccm.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apanccm");
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
      P03WJ2_A130BarCodPar = new String[] {""} ;
      P03WJ2_A132BarCodReo = new byte[1] ;
      P03WJ2_A129BarCod = new int[1] ;
      P03WJ2_A396EmprCod = new String[] {""} ;
      P03WJ2_A213BarSit = new byte[1] ;
      P03WJ2_A127BarAncCru1 = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P03WJ3_AV12N_p = new short[1] ;
      P03WJ3_A9846BarPieAncc = new int[1] ;
      P03WJ3_n9846BarPieAncc = new boolean[] {false} ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apanccm__default(),
         new Object[] {
             new Object[] {
            P03WJ2_A130BarCodPar, P03WJ2_A132BarCodReo, P03WJ2_A129BarCod, P03WJ2_A396EmprCod, P03WJ2_A213BarSit, P03WJ2_A127BarAncCru1
            }
            , new Object[] {
            P03WJ3_AV12N_p, P03WJ3_A9846BarPieAncc, P03WJ3_n9846BarPieAncc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short A127BarAncCru1 ;
   private short AV12N_p ;
   private short cV12N_p ;
   private short AV14Ancc ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV13MedAncc ;
   private int c9846BarPieAncc ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private boolean n9846BarPieAncc ;
   private IDataStoreProvider pr_default ;
   private String[] P03WJ2_A130BarCodPar ;
   private byte[] P03WJ2_A132BarCodReo ;
   private int[] P03WJ2_A129BarCod ;
   private String[] P03WJ2_A396EmprCod ;
   private byte[] P03WJ2_A213BarSit ;
   private short[] P03WJ2_A127BarAncCru1 ;
   private short[] P03WJ3_AV12N_p ;
   private int[] P03WJ3_A9846BarPieAncc ;
   private boolean[] P03WJ3_n9846BarPieAncc ;
}

final  class apanccm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03WJ2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSit, BarAncCru1 FROM TXPBARCAD WHERE (EmprCod = '001') AND (BarSit <= 6) ORDER BY EmprCod, BarSit ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03WJ3", "SELECT COUNT(*), SUM(BarPieAncc) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03WJ4", "UPDATE TXPBARCAD SET BarAncCru1=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

