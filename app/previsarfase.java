package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class previsarfase extends GXProcedure
{
   public previsarfase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( previsarfase.class ), "" );
   }

   public previsarfase( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      previsarfase.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      previsarfase.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      previsarfase.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      previsarfase.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      previsarfase.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      previsarfase.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P051J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P051J2_A457FasCod[0] ;
         A153BarFasEst = P051J2_A153BarFasEst[0] ;
         A194BarOrdLin = P051J2_A194BarOrdLin[0] ;
         A758ProCod = P051J2_A758ProCod[0] ;
         if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "REVISAR", "")) == 0 )
         {
            Gx_msg = ((GXutil.strcmp(A457FasCod, httpContext.getMessage( "REVISAR", ""))==0)&&(A153BarFasEst==2) ? " " : httpContext.getMessage( "Fase ", "")+GXutil.trim( A457FasCod)+httpContext.getMessage( "pendiente", "")) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = previsarfase.this.A396EmprCod;
      this.aP1[0] = previsarfase.this.A129BarCod;
      this.aP2[0] = previsarfase.this.A132BarCodReo;
      this.aP3[0] = previsarfase.this.A130BarCodPar;
      this.aP4[0] = previsarfase.this.Gx_msg;
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
      P051J2_A396EmprCod = new String[] {""} ;
      P051J2_A129BarCod = new int[1] ;
      P051J2_A132BarCodReo = new byte[1] ;
      P051J2_A130BarCodPar = new String[] {""} ;
      P051J2_A457FasCod = new String[] {""} ;
      P051J2_A153BarFasEst = new byte[1] ;
      P051J2_A194BarOrdLin = new short[1] ;
      P051J2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.previsarfase__default(),
         new Object[] {
             new Object[] {
            P051J2_A396EmprCod, P051J2_A129BarCod, P051J2_A132BarCodReo, P051J2_A130BarCodPar, P051J2_A457FasCod, P051J2_A153BarFasEst, P051J2_A194BarOrdLin, P051J2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P051J2_A396EmprCod ;
   private int[] P051J2_A129BarCod ;
   private byte[] P051J2_A132BarCodReo ;
   private String[] P051J2_A130BarCodPar ;
   private String[] P051J2_A457FasCod ;
   private byte[] P051J2_A153BarFasEst ;
   private short[] P051J2_A194BarOrdLin ;
   private String[] P051J2_A758ProCod ;
}

final  class previsarfase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P051J2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               return;
      }
   }

}

