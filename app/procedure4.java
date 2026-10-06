package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procedure4 extends GXProcedure
{
   public procedure4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procedure4.class ), "" );
   }

   public procedure4( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 )
   {
      procedure4.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             String[] aP5 )
   {
      procedure4.this.A396EmprCod = aP0;
      procedure4.this.AV9Lecbarcod = aP1;
      procedure4.this.AV10Lecbarreo = aP2;
      procedure4.this.AV11Lecbarpar = aP3;
      procedure4.this.AV12LecFasord = aP4;
      procedure4.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Fin = "" ;
      /* Using cursor P08D42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Lecbarcod), Byte.valueOf(AV10Lecbarreo), AV11Lecbarpar, Short.valueOf(AV12LecFasord)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P08D42_A194BarOrdLin[0] ;
         A130BarCodPar = P08D42_A130BarCodPar[0] ;
         A132BarCodReo = P08D42_A132BarCodReo[0] ;
         A129BarCod = P08D42_A129BarCod[0] ;
         A153BarFasEst = P08D42_A153BarFasEst[0] ;
         A758ProCod = P08D42_A758ProCod[0] ;
         AV8Fin = ((A153BarFasEst==1) ? httpContext.getMessage( "P", "") : httpContext.getMessage( "F", "")) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = procedure4.this.AV8Fin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Fin = "" ;
      scmdbuf = "" ;
      P08D42_A396EmprCod = new String[] {""} ;
      P08D42_A194BarOrdLin = new short[1] ;
      P08D42_A130BarCodPar = new String[] {""} ;
      P08D42_A132BarCodReo = new byte[1] ;
      P08D42_A129BarCod = new int[1] ;
      P08D42_A153BarFasEst = new byte[1] ;
      P08D42_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.procedure4__default(),
         new Object[] {
             new Object[] {
            P08D42_A396EmprCod, P08D42_A194BarOrdLin, P08D42_A130BarCodPar, P08D42_A132BarCodReo, P08D42_A129BarCod, P08D42_A153BarFasEst, P08D42_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Lecbarreo ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short AV12LecFasord ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV9Lecbarcod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV11Lecbarpar ;
   private String AV8Fin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P08D42_A396EmprCod ;
   private short[] P08D42_A194BarOrdLin ;
   private String[] P08D42_A130BarCodPar ;
   private byte[] P08D42_A132BarCodReo ;
   private int[] P08D42_A129BarCod ;
   private byte[] P08D42_A153BarFasEst ;
   private String[] P08D42_A758ProCod ;
}

final  class procedure4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08D42", "SELECT EmprCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

