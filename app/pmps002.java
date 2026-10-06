package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmps002 extends GXProcedure
{
   public pmps002( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmps002.class ), "" );
   }

   public pmps002( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pmps002.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pmps002.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmps002.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmps002.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmps002.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmps002.this.AV8BarOrdlin = aP4[0];
      this.aP4 = aP4;
      pmps002.this.AV9Incidencia = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Incidencia = "" ;
      /* Using cursor P05RR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV8BarOrdlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P05RR2_A194BarOrdLin[0] ;
         A153BarFasEst = P05RR2_A153BarFasEst[0] ;
         A457FasCod = P05RR2_A457FasCod[0] ;
         A758ProCod = P05RR2_A758ProCod[0] ;
         if ( A153BarFasEst > 0 )
         {
            AV9Incidencia = "# " + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Fase ", "") + GXutil.trim( A457FasCod) + httpContext.getMessage( " realizada", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmps002.this.A396EmprCod;
      this.aP1[0] = pmps002.this.A129BarCod;
      this.aP2[0] = pmps002.this.A132BarCodReo;
      this.aP3[0] = pmps002.this.A130BarCodPar;
      this.aP4[0] = pmps002.this.AV8BarOrdlin;
      this.aP5[0] = pmps002.this.AV9Incidencia;
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
      P05RR2_A396EmprCod = new String[] {""} ;
      P05RR2_A129BarCod = new int[1] ;
      P05RR2_A132BarCodReo = new byte[1] ;
      P05RR2_A130BarCodPar = new String[] {""} ;
      P05RR2_A194BarOrdLin = new short[1] ;
      P05RR2_A153BarFasEst = new byte[1] ;
      P05RR2_A457FasCod = new String[] {""} ;
      P05RR2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmps002__default(),
         new Object[] {
             new Object[] {
            P05RR2_A396EmprCod, P05RR2_A129BarCod, P05RR2_A132BarCodReo, P05RR2_A130BarCodPar, P05RR2_A194BarOrdLin, P05RR2_A153BarFasEst, P05RR2_A457FasCod, P05RR2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short AV8BarOrdlin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9Incidencia ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05RR2_A396EmprCod ;
   private int[] P05RR2_A129BarCod ;
   private byte[] P05RR2_A132BarCodReo ;
   private String[] P05RR2_A130BarCodPar ;
   private short[] P05RR2_A194BarOrdLin ;
   private byte[] P05RR2_A153BarFasEst ;
   private String[] P05RR2_A457FasCod ;
   private String[] P05RR2_A758ProCod ;
}

final  class pmps002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05RR2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, FasCod, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin > ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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

