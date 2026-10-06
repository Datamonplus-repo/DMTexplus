package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlhdrexisteyagrupada extends GXProcedure
{
   public controlhdrexisteyagrupada( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlhdrexisteyagrupada.class ), "" );
   }

   public controlhdrexisteyagrupada( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      controlhdrexisteyagrupada.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      controlhdrexisteyagrupada.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      controlhdrexisteyagrupada.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      controlhdrexisteyagrupada.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      controlhdrexisteyagrupada.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      controlhdrexisteyagrupada.this.aP4 = aP4;
      controlhdrexisteyagrupada.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok_hdr = (byte)(0) ;
      AV9baragrest = httpContext.getMessage( "N", "") ;
      /* Using cursor P09F02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P09F02_A120BarAgrEst[0] ;
         AV8Ok_hdr = (byte)(1) ;
         AV9baragrest = A120BarAgrEst ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = controlhdrexisteyagrupada.this.A396EmprCod;
      this.aP1[0] = controlhdrexisteyagrupada.this.A129BarCod;
      this.aP2[0] = controlhdrexisteyagrupada.this.A132BarCodReo;
      this.aP3[0] = controlhdrexisteyagrupada.this.A130BarCodPar;
      this.aP4[0] = controlhdrexisteyagrupada.this.AV8Ok_hdr;
      this.aP5[0] = controlhdrexisteyagrupada.this.AV9baragrest;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9baragrest = "" ;
      scmdbuf = "" ;
      P09F02_A396EmprCod = new String[] {""} ;
      P09F02_A129BarCod = new int[1] ;
      P09F02_A132BarCodReo = new byte[1] ;
      P09F02_A130BarCodPar = new String[] {""} ;
      P09F02_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.controlhdrexisteyagrupada__default(),
         new Object[] {
             new Object[] {
            P09F02_A396EmprCod, P09F02_A129BarCod, P09F02_A132BarCodReo, P09F02_A130BarCodPar, P09F02_A120BarAgrEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Ok_hdr ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9baragrest ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09F02_A396EmprCod ;
   private int[] P09F02_A129BarCod ;
   private byte[] P09F02_A132BarCodReo ;
   private String[] P09F02_A130BarCodPar ;
   private String[] P09F02_A120BarAgrEst ;
}

final  class controlhdrexisteyagrupada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09F02", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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

